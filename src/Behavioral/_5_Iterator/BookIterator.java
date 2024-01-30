package Behavioral._5_Iterator;

public class BookIterator implements Iterator<String>{
// Concrete iterator

    private String[] books;
    private int position;

    public BookIterator(String[] books){
        this.books = books;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        return position < books.length;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return books[position++];
        }
        return null; // or throw NoSuchElementException
    }
}
