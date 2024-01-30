package Behavioral._6_Memento;

public interface Originator {
// Originator interface

    Memento save();
    void restore(Memento memento);
}
