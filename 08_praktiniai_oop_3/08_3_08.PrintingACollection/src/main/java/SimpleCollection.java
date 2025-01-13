
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder("The collection " + name);
        int size = elements.size();
        switch(size) {
            case 0:
                str.append(" is empty.");
                break;
            case 1:
                str.append(" has ").append(elements.size()).append(" element:\n").append(elements.getFirst());
                break;
            default:
                str.append(" has ").append(elements.size()).append(" elements:\n");
                for (String letter : elements) {
                    str.append(letter).append("\n");
                }
                break;
        }

        return str.toString();
    }

}
