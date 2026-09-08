public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book("Java Programming");
        b1.setPrice(120.45f);

        Book b2 = new Book("C++ Programming");
        b2.setPrice(250.50f);

        Book b3 = new Book("Python Programming");
        b3.setPrice(300.75f);

        b1.display();
        b2.display();
        b3.display();
    }
}