package Structural._6_Flyweight;

public class UnsharedCharacterFlyweight implements CharacterFlyweight{
// Unshared flyweight - UnsharedCharacterFlyweight
    private char character;
    private String color;

    public UnsharedCharacterFlyweight(char character, String color) {
        this.character = character;
        this.color = color;
    }

    @Override
    public void display(int fontSize) {
        System.out.println("Character: " + character + ", Font Size: " + fontSize + ", Color: " + color);
    }
}
