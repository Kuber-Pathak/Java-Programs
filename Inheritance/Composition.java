
class Address {
    String city, zone, district;

    Address(String c, String z, String d) {
        city = c;
        zone = z;
        district = d;
    }

    void display() {
        System.out.println("City = " + city + " Zone = " + zone + " District = " + district);
    }
}

class Person {
    String name;

    Person(String n) {
        name = n;

    }
    void display() {
        System.out.println("Name = " + name);
    }
}

class Employee extends Person {
    Address add;
    int salary;

    Employee(int s, Address a, String n) {
        super(n);
        salary = s;
        add = a;
    }

    void display() {
        super.display();
        add.display();
        System.out.println("Salary = " + salary);
    }
}

public class Composition {
    public static void main(String[] args) {
        Address a = new Address("Mechi", "jhapa", " Dhulbari");
        Employee e = new Employee(50000, a, "Ram");
        e.display();
    }
}
