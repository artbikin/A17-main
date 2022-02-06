package interview;

public class FizzBuzz {
    public static void main(String[] args) {
        int border = 100;
        fizzbuzz(border);
    }

    private static void fizzbuzz(int border) {
        for (int i = 1;i<=border;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
