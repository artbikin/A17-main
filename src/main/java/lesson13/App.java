package lesson13;

public class App {
    public static void main(String[] args) {

        int a = 5;
        int b = a;
        a=10;
        System.out.println("b="+b);

        Person person1 = new Person("Anna");
        Person person2 = person1;
        person1.setName("Jane");

        System.out.println(person2.getName());

        int[]arr1 = {1,2};
        int[]arr2=arr1;

        arr1[0]=10;
        arr1[1]=10;

        System.out.println(arr2[1]);

    }
}
