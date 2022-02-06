package interview;

public class Remainder {
    public static void main(String[] args) {
        int result = remainder(20,11);
        result = remainder2(25,10);
        System.out.println(result);
    }

    private static int remainder2(int a, int b) {
//        return a-(a/b)*b;
        int x = (int)a/b;
        return a-x*b;
    }


    private static int remainder(int a, int b) {
//        return a%b;
        while (a>=b){
            a=a-b;
        }
        return a;
    }
}
