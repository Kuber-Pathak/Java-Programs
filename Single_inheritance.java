class Person{
    String name,address;
    int age;
    Person(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public void display(){
        System.out.println("Name = "+name+"\nAddress = "+address+"\nAge = "+age);
    }
}
class Student extends Person{
    String department;
    int roll;
    Student(String name,String address,int age,String department,int roll){
        super(name,address,age);
        this.department=department;
        this.roll=roll;
    }
    public void display(){
        super.display();
        System.out.println("Department = "+department+"\nRoll = "+roll);
    }
}
class Single_inheritance{
    public static void main(String[] args){
        Student s = new Student("Kuber","Ktm",21,"IT",17);
        s.display();
    }
}