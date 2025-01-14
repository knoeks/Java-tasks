import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // paziuri ar tas pats reference jei taip tada iskart returnina true
        // jei reference kitas bet reiksmes tos pacios, reiks toliau tikrinti
        if (o == null || getClass() != o.getClass()) return false;
        // paziuri ar tikrinamas objektas nenull ir ar sutampa klases
        // kitaip returnina false
        Item item = (Item) o;
        // casting
        return Objects.equals(name, item.name);
        // patikrinama ar objekto informacija sutampa
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
        // su pasirinkta informacija sugeneruoja hashCode
    }
}
