package oop;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I draw a rectangle with w = "+this.width + ", h = "+this.height);
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
}
