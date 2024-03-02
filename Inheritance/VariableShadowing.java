class Test {
    int x = 30;

    void display(int x) {
        System.out.println(x); // Prints the method parameter value and shadows x = 30
        System.out.println(this.x); // prints x = 30
    }
}

public class VariableShadowing {
    public static void main(String[] args) {
        Test t = new Test();
        t.display(5);
    }
}
