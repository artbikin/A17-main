package lesson15;

public class App1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        final int FINAL = 5;
//        FINAL=7;

        int[]numbers={1,1};

        System.out.println("Before try/catch block");

        try{
            System.out.println("In try block before problem");
            int c = a/b;
            numbers[1] = 9;
            System.out.println("In try block after problem");
//            throw new IllegalArgumentException("Wrong Argument");
        } catch (ArithmeticException err){
            System.out.println("In the catch block");
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("In the different catch block");
        } catch (IllegalArgumentException err){
            System.out.println("Will catch ALL exceptions");
            throw err;
        }
        finally {
            System.out.println("Will run in ANY CASE");
        }
        System.out.println("After try/catch block");


    }
}
