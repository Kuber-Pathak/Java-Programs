//Serialization in Java is the concept of representing an object's state as a byte stream.
//Here ObjectOutputStream is used to serialize the Student object into serialize.txt
import java.io.*;

class Student implements Serializable {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name = " + name + "\nRoll = " + roll);
    }
}

public class Object_Serialization {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("serialize.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s = new Student("Ram", 17);
        oos.writeObject(s);
        System.out.println("Serialization complete");
        oos.close();
        fos.close();
        FileInputStream fis = new FileInputStream("serialize.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student std = (Student) ois.readObject();
        std.display();
        System.out.println("DeSerialization complete");
        ois.close();
        fis.close();

    }
}
