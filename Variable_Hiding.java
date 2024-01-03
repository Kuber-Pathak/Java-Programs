//Here the variable 'a' of "Super" class is hidden and only variable 'a' of sub class is shown
class Super {
    int a = 10;
}

class Sub extends Super {
    int a = 20;
}

public class Variable_Hiding {

    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.a);
    }
}