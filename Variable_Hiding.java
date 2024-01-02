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