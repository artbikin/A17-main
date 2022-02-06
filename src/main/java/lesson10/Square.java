package lesson10;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void draw(){
        System.out.println("I draw Square with side = " +getHeight());
    }

//    @Override
//    public void doSomething(){
//        System.out.println("Do something else");
//    }
}
