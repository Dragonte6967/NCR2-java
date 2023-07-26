package Chapter1;

class Circle {
    static double PI = 3.14159265;
    int radius;
}

public class TestMemberVariable {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 10;
        System.out.println(Circle.PI);
        System.out.println(c.radius);
        System.out.println(c.PI);
    }
}
