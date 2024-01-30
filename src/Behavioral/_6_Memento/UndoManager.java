package Behavioral._6_Memento;

import java.util.ArrayList;
import java.util.List;

public class UndoManager {
// Caretaker

    private List<Memento> history;
    private int currentIndex;

    public UndoManager() {
        this.history = new ArrayList<>();
        this.currentIndex = -1;
    }

    public void saveState(Memento memento) {
        // Save a new state and discard any redo states
        history.subList(currentIndex + 1, history.size()).clear();
        history.add(memento);
        currentIndex++;
    }

    public Memento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return history.get(currentIndex);
        }
        return null; // No more undo states
    }

    public Memento redo() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            return history.get(currentIndex);
        }
        return null; // No more redo states
    }
}
