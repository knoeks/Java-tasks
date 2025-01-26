package org.example;

import lt.itakademija.exam.IdGenerator;

public class IdGeneratorWrapper implements IdGeneratorInterface{
  private final IdGenerator idGenerator;

  public IdGeneratorWrapper(IdGenerator idGenerator) {
    this.idGenerator = idGenerator;
  }

  @Override
  public int generateId() {
    return idGenerator.generateId();
  }
}
