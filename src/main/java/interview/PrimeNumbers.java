package interview;

public class PrimeNumbers {
    public static void main(String[] args) {
        int border = 100;
        printPrimes(border);
    }

    private static void printPrimes(int border) {
        for (int i=2;i<=border;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
