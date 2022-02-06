package lesson10am;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(){}

    public void draw(){
        System.out.println("I draw a rectangle with h= "+height+" w= "+width);
    }

    // final - cannot override in child class
    public final void doSomething(){
        System.out.println("I do something");
    }

    public int area(){
        return height*width;
    }

    public int perimeter(){
        return 2*height + 2*width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
