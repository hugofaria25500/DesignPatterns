package Behavioral._6_Memento;

public class TextEditor implements Originator{
// Concrete Originator

    private StringBuilder text;

    public TextEditor() {
        this.text = new StringBuilder();
    }

    public void appendText(String newText) {
        this.text.append(newText);
    }

    public void deleteLastCharacter() {
        if (text.length() > 0) {
            text.deleteCharAt(text.length() - 1);
        }
    }

    @Override
    public String toString(){
        return text.toString();
    }

    @Override
    public Memento save() {
        // Save the current state as a memento
        return new TextEditorMemento(text.toString());
    }

    @Override
    public void restore(Memento memento) {
        // Restore the state from the provided memento
        if (memento instanceof TextEditorMemento) {
            this.text = new StringBuilder(((TextEditorMemento) memento).getState());
        }
    }

    // Inner concrete memento class
    private static class TextEditorMemento implements Memento {
        private final String state;

        public TextEditorMemento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
