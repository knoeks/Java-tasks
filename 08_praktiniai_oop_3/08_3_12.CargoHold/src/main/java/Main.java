
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("The Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

        suitcase.printItems();

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);

        hold.printItems();
//        System.out.println("name: " + book.getName());
//        System.out.println("weight: " + book.getWeight());
//
//        System.out.println("book: " + book);
//        System.out.println("phone: " + phone);

    }

}
