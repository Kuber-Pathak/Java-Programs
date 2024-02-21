//Whenever a variable is declared as static, 
//this means there is only one copy of it for the entire class, 
//rather than each instance having its own copy.
//A static variable can be called without creating an instance of the class
//,it is called using the class name
class test {
    static int static_var = 1; // static variable

}

public class Static_Variable {
    public static void main(String[] args) {
        System.out.println("static_var: " + BufferReader.static_var);
    }

}