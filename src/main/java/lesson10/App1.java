package lesson10;

public class App1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,3);
        r1.draw();
        System.out.println(r1.perimeter());

        Square s1 = new Square(7);

        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        s1.draw();

        r1.doSomething();
        s1.doSomething();
    }
}
