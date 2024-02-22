//Constructor overloading in Java refers to the use of more than one constructor in an instance class.
//Here e1 is invokes Default constructor and e2 invokes Parameterized constructor.
class Employee{
    String name,post;
    double salary;
    Employee(){
        name="Kuber";
        post="Manager";
        salary=50000;
    }
    Employee(String name,String post,double salary){
        this.name=name;
        this.post=post;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name = "+name+"\nPost = "+post+"\nSalary = "+salary);
    }
}
class Constructor_Overloading{
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2= new Employee("Hari","Junior Manager",40000);
        System.out.println("Default constructor inovokes:");
        e1.display();
        System.out.println("\nParameterized constructor invokes:");
        e2.display();
    }
}