//A java program that shows how to use getter and setter to input and display a student data 
class Student{
    int roll;
    String address,name;
    void setName(String n){
        name=n;
    }
    String getName(){
        return name;
    }
    void setAddress(String a){
        address=a;
    }
    String getAddress(){
        return address;
    }
    void setRoll(int r){
        roll=r;
    }
    int getRoll(){
        return roll;
    }
}
class Getter_Setter{
    public static void main(String[] args){
        Student  s= new Student();
        s.setName("Kuber");
        s.setAddress("Ktm");
        s.setRoll(17);
        System.out.println("Name = "+s.getName()+"\nAddress = "+s.getAddress()+"\nRoll = "+s.getRoll());
    }
}