package lesson10;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void draw(){
        System.out.println("I draw a rectangle with h = "+height+", w = "+width);
    }

    public final void doSomething(){
        System.out.println("I do something");
    }

    public int area(){
        return height*width;
    }

    public int perimeter(){
        return 2*(width+height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
