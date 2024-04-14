// Step 1: Define the Furniture class
class Furniture {
    String name;
    String style;
    String material;
    float price;
}

// Step 2: Define the abstract FurnitureFactory class
abstract class FurnitureFactory {
    abstract Chair createChair();
    abstract Table createTable();
    abstract Sofa createSofa();
}

// Step 3: Create concrete FurnitureFactory classes
class ModernWoodFactory extends FurnitureFactory {
    @Override
    Chair createChair() {
        return new ModernChair("Wood", 150.0f);
    }

    @Override
    Table createTable() {
        return new ModernTable("Wood", 300.0f);
    }

    @Override
    Sofa createSofa() {
        return new ModernSofa("Wood", 500.0f);
    }
}

class TraditionalMetalFactory extends FurnitureFactory {
    @Override
    Chair createChair() {
        return new TraditionalChair("Metal", 200.0f);
    }

    @Override
    Table createTable() {
        return new TraditionalTable("Metal", 400.0f);
    }

    @Override
    Sofa createSofa() {
        return new TraditionalSofa("Metal", 600.0f);
    }
}

// Step 4: Define Chair, Table, and Sofa classes
abstract class Chair {
    String material;
    float price;
}

abstract class Table {
    String material;
    float price;
}

abstract class Sofa {
    String material;
    float price;
}

// Step 5: Implement Chair, Table, and Sofa classes for each style and material
class ModernChair extends Chair {
    ModernChair(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class ModernTable extends Table {
    ModernTable(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class ModernSofa extends Sofa {
    ModernSofa(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class TraditionalChair extends Chair {
    TraditionalChair(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class TraditionalTable extends Table {
    TraditionalTable(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class TraditionalSofa extends Sofa {
    TraditionalSofa(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

// Step 6: Create a FurnitureCreator class
class FurnitureCreator {
    private FurnitureFactory factory;

    void setFactory(FurnitureFactory factory) {
        this.factory = factory;
    }

    Chair createChair() {
        return factory.createChair();
    }

    Table createTable() {
        return factory.createTable();
    }

    Sofa createSofa() {
        return factory.createSofa();
    }
}

// Step 7: Implement a system for allowing users to view and purchase products
public class Ex3 {
    public static void main(String[] args) {
        FurnitureCreator creator = new FurnitureCreator();

        // User selects style and material
        FurnitureFactory factory = new ModernWoodFactory();
        creator.setFactory(factory);

        // User views and purchases products
        Chair chair = creator.createChair();
        Table table = creator.createTable();
        Sofa sofa = creator.createSofa();

        // Displaying the selected products
        System.out.println("Selected Furniture:");
        System.out.println("Chair: Material - " + chair.material + ", Price - $" + chair.price);
        System.out.println("Table: Material - " + table.material + ", Price - $" + table.price);
        System.out.println("Sofa: Material - " + sofa.material + ", Price - $" + sofa.price);
    }
}
