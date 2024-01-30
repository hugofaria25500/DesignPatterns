package Behavioral._5_Iterator;

public interface Aggregator<T> {
// Aggregate interface
    Iterator<T> createIterator();
}
