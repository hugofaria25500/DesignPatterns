package Behavioral._5_Iterator;

public class Library implements Aggregator<String>{
//Concrete aggregate

    private String[] fictionBooks;
    private String[] nonFictionBooks;

    public Library(String[] fictionBooks, String[] nonFictionBooks) {
        this.fictionBooks = fictionBooks;
        this.nonFictionBooks = nonFictionBooks;
    }

    @Override
    public Iterator<String> createIterator() {
        return new BookIterator(fictionBooks); // or nonFictionBooks, depending on the desired section
    }
}
