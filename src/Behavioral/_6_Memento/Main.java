package Behavioral._6_Memento;

public class Main {
//Code Client

    public static void main(String[] args) {
        // Create a TextEditor and UndoManager
        TextEditor textEditor = new TextEditor();
        UndoManager undoManager = new UndoManager();

        // Append text
        textEditor.appendText("Hello, ");
        printCurrentState(textEditor);

        // Save the state after appending text
        undoManager.saveState(textEditor.save());

        // Append more text
        textEditor.appendText("world!");
        printCurrentState(textEditor);

        // Undo the last operation
        undoManager.undo();
        printCurrentState(textEditor);

        // Redo the undone operation
        undoManager.redo();
        printCurrentState(textEditor);

        // Delete the last character
        textEditor.deleteLastCharacter();
        printCurrentState(textEditor);

        // Save the state after deleting the last character
        undoManager.saveState(textEditor.save());

        // Print the final state
        printCurrentState(textEditor);
    }

    private static void printCurrentState(TextEditor textEditor) {
        System.out.println("Current State: " + textEditor);
    }
}
