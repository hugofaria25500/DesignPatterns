package Behavioral._5_Iterator;

public class Main {
//Client Code

    public static void main(String[] args) {
        String[] fictionBooks = {"Book1", "Book2", "Book3"};
        String[] nonFictionBooks = {"BookA", "BookB", "BookC"};

        Library fictionLibrary = new Library(fictionBooks, nonFictionBooks);
        Iterator<String> iterator = fictionLibrary.createIterator();

        while (iterator.hasNext()) {
            String book = iterator.next();
            System.out.println("Book: " + book);
        }
    }
}
