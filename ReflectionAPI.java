import java.lang.reflect.*;

class Myclass {
    private String name = "Ram";

    private Myclass() {
        System.out.println("Private Constructor");
    }

    private void display() {
        System.out.println("Name is : " + name);
    }
}

class ReflectionAPI {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Myclass");

            Field f = c.getDeclaredField("name");
            f.setAccessible(true);

            Method m = c.getDeclaredMethod("display");
            m.setAccessible(true);

            Constructor co = c.getDeclaredConstructor();
            co.setAccessible(true);

            Object obj = co.newInstance();
            m.invoke(obj);

            String name = (String) f.get(obj);
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
