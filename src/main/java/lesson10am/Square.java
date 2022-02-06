package lesson10am;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    // override a method in the parent class
    @Override
    public void draw(){
        System.out.println("I draw a square with side = "+getHeight());
    }

    // 'doSomething()' cannot override 'doSomething()' in 'lesson10am.Rectangle'; overridden method is final

    //@Override
    //public void doSomething(){
        //System.out.println("Do something else");
    //}



}
