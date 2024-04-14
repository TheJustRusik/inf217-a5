// Step 1: Define the Character2 class
class Character2 {
    String name;
    String characterClass;
    Weapon weapon;
    int health;
    int mana;
}

// Step 2: Define the Weapon class
class Weapon {
    String type;
    int damage;
    int speed;
    int range;
}

// Step 3: Define an abstract CharacterFactory2 class
abstract class CharacterFactory2 {
    abstract Character2 createCharacter();
    abstract Weapon createWeapon();
}

// Step 4: Create concrete CharacterFactory2 classes
class WarriorSwordFactory extends CharacterFactory2 {
    @Override
    Character2 createCharacter() {
        Character2 warrior = new Character2();
        warrior.characterClass = "Warrior";
        warrior.health = 100;
        warrior.mana = 50;
        return warrior;
    }

    @Override
    Weapon createWeapon() {
        Weapon sword = new Weapon();
        sword.type = "Sword";
        sword.damage = 20;
        sword.speed = 10;
        sword.range = 2;
        return sword;
    }
}

// Similar factories for other combinations: MageStaffFactory, ArcherBowFactory
// Step 4: Create concrete CharacterFactory classes
class MageStaffFactory extends CharacterFactory2 {
    @Override
    Character2 createCharacter() {
        Character2 mage = new Character2();
        mage.characterClass = "Mage";
        mage.health = 80;
        mage.mana = 100;
        return mage;
    }

    @Override
    Weapon createWeapon() {
        Weapon staff = new Weapon();
        staff.type = "Staff";
        staff.damage = 15;
        staff.speed = 8;
        staff.range = 5;
        return staff;
    }
}

class ArcherBowFactory extends CharacterFactory2 {
    @Override
    Character2 createCharacter() {
        Character2 archer = new Character2();
        archer.characterClass = "Archer";
        archer.health = 70;
        archer.mana = 70;
        return archer;
    }

    @Override
    Weapon createWeapon() {
        Weapon bow = new Weapon();
        bow.type = "Bow";
        bow.damage = 25;
        bow.speed = 12;
        bow.range = 10;
        return bow;
    }
}

// Step 6: Create a CharacterCreator2 class
class CharacterCreator2 {
    private CharacterFactory2 factory;

    void setFactory(CharacterFactory2 factory) {
        this.factory = factory;
    }

    Character2 createCharacter() {
        Character2 character = factory.createCharacter();
        character.weapon = factory.createWeapon();
        return character;
    }
}

// Step 8: Implement a system for allowing players to create characters
public class Ex4 {
    public static void main(String[] args) {
        CharacterCreator2 creator = new CharacterCreator2();

        // Player chooses Warrior with Sword
        creator.setFactory(new WarriorSwordFactory());
        Character2 warrior = creator.createCharacter();

        // Player chooses Mage with Staff
        creator.setFactory(new MageStaffFactory());
        Character2 mage = creator.createCharacter();

        // Player chooses Archer with Bow
        creator.setFactory(new ArcherBowFactory());
        Character2 archer = creator.createCharacter();

        // Now, the player can use these characters to play the game online
    }
}

