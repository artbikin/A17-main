package oop;

public class Square extends Rectangle{
    public Square(int size) {
        super(size, size);
    }

    @Override
    public void draw(){
        System.out.println("I draw a square with size = "+ getHeight());
    }
}
