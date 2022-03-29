import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashSet");
        System.out.println("hello world");
        Person_1 p1 =new Person_1();
        p1.setId(100);
        p1.setName("John");

        Person_1 p2 =new Person_1();
        p2.setId(100);
        p2.setName("Jonh");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p2.equals(p1));


        System.out.println(p1.equals(p2));
        Person_1 p3 =p2;
        System.out.println(p2.equals(p3));
        System.out.println("TEST for GIT");




    }
}
