class Base {
    private void display() {
        System.out.println("I am base private");
    }

    // Public method to call the private method within the same class
    public void show() {
        display();
    }
}

class Child extends Base {
    public void display() { // Note: This is not overriding; it's just a new method in Child.
        System.out.println("I am child public");
    }
}

public class OverridePrivateFunction {
    public static void main(String[] args) {
        Base b = new Child();
        b.show(); // This will call Base's show, which in turn calls Base's display method

        // Directly calling display() on Child is not possible through a Base reference
        // To directly call Child's display(), you need a reference of type Child
        Child c = new Child();
        c.display(); // This calls Child's display() method directly.
    }
}