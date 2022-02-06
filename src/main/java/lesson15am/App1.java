package lesson15am;

public class App1 {

    public static void main(String[] args) {
        // exceptions
        int a = 5;
        int b = 1;

        int [] numbers = {1, 1};

        //int c = a / b;

        //System.out.println(c);

        // special way to handle exceptions in java
        // for potentially dangerous operations

        System.out.println("Before");
        try{
            System.out.println("In the try block before problem.");
            int c = a / b;
            numbers[4] = 9;
            System.out.println("In the try block after problem.");
            throw new IllegalArgumentException("Wrong Argument");
        } catch(ArithmeticException err){
            System.out.println("In the first catch block.");
        } catch(ArrayIndexOutOfBoundsException err){
            System.out.println("In the second catch block.");
        } finally{
            System.out.println("Will run in any case");
        }

        // do NOT do this
        // not informative
        // catch (Exception err){System.out.println("Will catch ALL exceptions.");}

        System.out.println("After");

    }

}
