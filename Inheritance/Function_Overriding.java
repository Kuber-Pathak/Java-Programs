/*
If a base class and derived classes have member function with exactly same prototype.
Then if we call the function using the object of derived class, the member function of derived class is called.
This phenomenon is know as function overriding.
*/
class Base {
    void display() {
        System.out.println("I am Base");
    }
}

class Derived extends Base {
    void display() {
        System.out.println("I am Derived");
    }
}

public class Function_Overriding {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}