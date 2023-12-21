//A program that demonstrates Multiple inheritance.
//Here Manager is a child class ko Employee and Employee is also a child class of Human.
//here 'super' keyword is used to call the functionalities of parent class.
class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showData() {
        System.out.println("Name = " + name + "\nAge = " + age);
    }
}

class Employee extends Human {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void showData() {
        super.showData();
        System.out.println("Salary = " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    void showData() {
        super.showData();
    }
}

class Multilevel_Inheritance {
    public static void main(String[] args) {
        Manager m = new Manager("kuber", 21, 60000);
        m.showData();
    }
}