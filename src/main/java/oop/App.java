package oop;

public class App {
    public static void main(String[] args) {
        Square s1 = new Square(5);

        Circle c1 = new Circle(4);

        Rectangle r1 = new Rectangle(5,9);

        Rectangle s2 = new Square(3);

        Shape c2 = new Circle(7);
        Shape r2 = new Rectangle(9,1);
        Shape s3 = new Square(7);

        Shape[] shapes = {s1,c1,r1,s2,c2,r2,s3};

        for (Shape shape:shapes){
            shape.draw();
        }

        double areas = 0;
        for (Shape shape:shapes){
            areas = areas+shape.getArea();
        }
        System.out.println("All areas = "+areas);

//        Square xx = new Rectangle(5,8);


    }
}
