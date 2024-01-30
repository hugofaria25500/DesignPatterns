package Structural._6_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
// Flyweight factory - CharacterFlyweightFactory
    private Map<Character, CharacterFlyweight> flyweights = new HashMap<>();

    // Method to get or create a flyweight object based on the character
    public CharacterFlyweight getCharacterFlyweight(char character) {
        return flyweights.computeIfAbsent(character, ConcreteCharacterFlyweight::new);
    }

    // Method to get or create an unshared flyweight object based on the character and color
    public CharacterFlyweight getUnsharedCharacterFlyweight(char character, String color) {
        return new UnsharedCharacterFlyweight(character, color);
    }
}
