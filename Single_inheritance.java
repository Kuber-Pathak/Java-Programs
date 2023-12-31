//Single Inheritance means that only one class extends the parent class.
//The child class has all the properties of its parent class.
//Here 'Person' is the parent class and 'Student' is a child class.
//'extend' keyword is used for inheritance.
class Person {
    String name, address;
    int age;

    Person(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }

    public void display() {
        System.out.println("Name = " + name + "\nAddress = " + address + "\nAge = " + age);
    }
}

class Student extends Person {
    String department;
    int roll;

    Student(String n, String a, int ag, String d, int r) {
        super(n, a, ag);
        department = d;
        roll = r;
    }

    public void display() {
        super.display();
        System.out.println("Department = " + department + "\nRoll = " + roll);
    }
}

class Single_inheritance {
    public static void main(String[] args) {
        Student s = new Student("Kuber", "Ktm", 21, "IT", 17);
        s.display();
    }
}