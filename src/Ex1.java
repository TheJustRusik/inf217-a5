import java.util.List;
import java.util.ArrayList;

// Step 1: Define the Character class
class Character {
    private String name;
    private Appearance appearance;
    private List<Ability> abilities;
    private List<Equipment> equipment;
    private Attributes attributes;

    public Character(String name, Appearance appearance, List<Ability> abilities, List<Equipment> equipment, Attributes attributes) {
        this.name = name;
        this.appearance = appearance;
        this.abilities = abilities;
        this.equipment = equipment;
        this.attributes = attributes;
    }

    // Getters and setters
}

// Step 2: Define an abstract CharacterFactory class
abstract class CharacterFactory {
    public abstract Character createCharacter(String name);
}

// Step 3: Create concrete CharacterFactory classes
class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        // Implement creation logic for warrior character
    }
}

class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        // Implement creation logic for mage character
    }
}

class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        // Implement creation logic for archer character
    }
}

// Step 4: Define classes for Appearance, Ability, Equipment, and Attribute
class Appearance {
    // Properties and methods for appearance customization
}

class Ability {
    // Properties and methods for character abilities
}

class Equipment {
    // Properties and methods for character equipment
}

class Attributes {
    // Properties and methods for character attributes
}

// Step 5: Create a CharacterCreator class
class CharacterCreator {
    private CharacterFactory factory;

    public void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    public Character createCharacter(String name) {
        return factory.createCharacter(name);
    }
}

// Step 6: Use the CharacterCreator and concrete factories to create characters
public class Ex1 {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();

        // Create a warrior character
        creator.setFactory(new WarriorFactory());
        Character warrior = creator.createCharacter("Warrior 1");

        // Create a mage character
        creator.setFactory(new MageFactory());
        Character mage = creator.createCharacter("Mage 1");

        // Create an archer character
        creator.setFactory(new ArcherFactory());
        Character archer = creator.createCharacter("Archer 1");

        // Use the characters in the game
    }
}
