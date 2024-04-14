import java.util.ArrayList;
import java.util.List;

// Step 4: Define Appearance, Ability, Equipment, and Attribute classes

class Appearance {
    private String appearanceType;

    public Appearance(String appearanceType) {
        this.appearanceType = appearanceType;
    }

    public String getAppearanceType() {
        return appearanceType;
    }
}

class Ability {
    private String abilityName;

    public Ability(String abilityName) {
        this.abilityName = abilityName;
    }

    public String getAbilityName() {
        return abilityName;
    }
}

class Equipment {
    private String equipmentType;

    public Equipment(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }
}

class Attribute {
    private String attributeName;
    private int attributeValue;

    public Attribute(String attributeName, int attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public int getAttributeValue() {
        return attributeValue;
    }
}

// Step 1: Define the Character class

class Character {
    private String name;
    private Appearance appearance;
    private List<Ability> abilities;
    private List<Equipment> equipment;
    private Attribute attributes;

    public Character(String name, Appearance appearance, List<Ability> abilities, List<Equipment> equipment, Attribute attributes) {
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
        Appearance appearance = new Appearance("Warrior Appearance");
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Warrior Ability"));
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Equipment("Warrior Equipment"));
        Attribute attributes = new Attribute("Warrior Attribute", 100);
        return new Character(name, appearance, abilities, equipment, attributes);
    }
}

class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance("Mage Appearance");
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Mage Ability"));
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Equipment("Mage Equipment"));
        Attribute attributes = new Attribute("Mage Attribute", 80);
        return new Character(name, appearance, abilities, equipment, attributes);
    }
}

class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance("Archer Appearance");
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Archer Ability"));
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Equipment("Archer Equipment"));
        Attribute attributes = new Attribute("Archer Attribute", 90);
        return new Character(name, appearance, abilities, equipment, attributes);
    }
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

public class Ex1 {
    public static void main(String[] args) {
        // Step 6: Use the CharacterCreator and the concrete factories to create different characters in the game
        CharacterCreator creator = new CharacterCreator();

        // Create a warrior
        creator.setFactory(new WarriorFactory());
        Character warrior = creator.createCharacter("Warrior Bob");

        // Create a mage
        creator.setFactory(new MageFactory());
        Character mage = creator.createCharacter("Mage Alice");

        // Create an archer
        creator.setFactory(new ArcherFactory());
        Character archer = creator.createCharacter("Archer Charlie");

        // Step 7: Implement a system for allowing players to customize their character's appearance, abilities, and equipment
        // This can involve user input and UI elements to select from available options for appearance, abilities, and equipment.
        // For brevity, this part is not implemented in this example.
    }
}
