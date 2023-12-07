//A basic java program that uses constructor to take input the data of a student;
class Student{
    int roll;
    String address,name;
    Student(String n,String a,int r){
        name=n;
        address=a;
        roll=r;
    }
    void diplay(){
        System.out.println("Name = "+name+"\nAddress = "+address+"\nRoll = "+roll);
    }
}
class Constructor{
     public static void main(String[] args){
        Student s = new Student("Kuber","Ktm",17);
        s.diplay();
    }
}