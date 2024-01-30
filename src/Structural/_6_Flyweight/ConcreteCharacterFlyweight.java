package Structural._6_Flyweight;

public class ConcreteCharacterFlyweight implements CharacterFlyweight{
// Concrete flyweight - ConcreteCharacterFlyweight
    private char character;

    public ConcreteCharacterFlyweight(char character) {
        this.character = character;
    }

    @Override
    public void display(int fontSize) {
        System.out.println("Character: " + character + ", Font Size: " + fontSize);
    }
}
