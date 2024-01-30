package Structural._6_Flyweight;

public class Main {
// Client code

    public static void main(String[] args) {
        CharacterFlyweightFactory flyweightFactory = new CharacterFlyweightFactory();

        // Use shared flyweights for common characters
        CharacterFlyweight a = flyweightFactory.getCharacterFlyweight('A');
        CharacterFlyweight b = flyweightFactory.getCharacterFlyweight('B');
        CharacterFlyweight aAgain = flyweightFactory.getCharacterFlyweight('A');

        a.display(12);
        b.display(16);
        aAgain.display(14);

        System.out.println();

        // Use unshared flyweights for characters with unique properties
        CharacterFlyweight cRed = flyweightFactory.getUnsharedCharacterFlyweight('C', "Red");
        CharacterFlyweight cBlue = flyweightFactory.getUnsharedCharacterFlyweight('C', "Blue");

        cRed.display(18);
        cBlue.display(20);
    }
}
