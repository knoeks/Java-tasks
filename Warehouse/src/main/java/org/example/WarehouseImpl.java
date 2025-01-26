package org.example;

import lt.itakademija.exam.*;
import lt.itakademija.exam.Package;
import lt.itakademija.exam.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class WarehouseImpl extends Warehouse {
  private final List<Client> clients;

  public WarehouseImpl(IdGenerator clientIdGenerator, IdGenerator packageIdGenerator, int totalSpace) {
    super(clientIdGenerator, packageIdGenerator, totalSpace);
    if (totalSpace < 1) {
      throw new IllegalArgumentException("warehouse total space should be above zero");
    }
    clients = new ArrayList<>();
  }

  @Override
  public int getTotalSpace() {
    return totalSpace;
  }

  @Override
  public int getAvailableSpace() {
    return getTotalSpace() - getReservedSpace();
  }

  @Override
  public int getTotalAvailableSpace() {
    return totalSpace - clients.stream().mapToInt(item -> item.getPackages().stream().mapToInt(Package::getSpace).sum()).sum();
  }

  @Override
  public int getReservedSpace() {
    return clients.stream().mapToInt(Client::getReservedSpace).sum();
  }

  @Override
  public Client registerClient(String s, int i) {
    // patikrinti ar jau toks klientas neegzistuoja
    if (getAvailableSpace() < i) {
      throw new InsufficientSpaceException("Space taken exceeds space available");
    }
    if (i <= 0) {
      throw new IllegalArgumentException("Space assigned cannot be negative");
    }
    int id = clientIdGenerator.generateId();
    System.out.println(id);
    Client client = new Client(id, s, i);
    clients.add(client);
    return client;
  }

  @Override
  public Package createPackage(String s, int i) {
    if (i < 1) {
      throw new IllegalArgumentException("Package weight number cannot be negative");
    }

    return new Package(packageIdGenerator.generateId(), s, i);
  }

  @Override
  public void storePackage(Client client, Package aPackage) {
    if (client.getAvailableSpace() < aPackage.getSpace()) {
      throw new InsufficientSpaceException("no space");
    }
    client.addPackage(aPackage);
  }

  @Override
  public Client getClientById(int i) {
    return clients.stream().filter(client -> client.getId() == i).findFirst().orElse(null);
  }

  @Override
  public boolean hasClientById(int i) {
    return getClientById(i) != null;

  }

  @Override
  public List<Client> findClientsBy(ClientPredicate clientPredicate) {
    return clients.stream().filter(clientPredicate::test).toList();
  }
}

