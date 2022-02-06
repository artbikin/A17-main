package lesson13am;

public class App {
    public static void main(String[] args) {

        // Reference type vs Primitive type

        // primitive type result in a Hard Copy

        int a = 5;
        int b = a;
        a = 10;
        // b is still 5
        System.out.println("b = "+b);

        // we do not create Hard Copy with Class objects
        // we make a reference, NOT a new copy
        // person2 references person1
        // person2 and person1 are the SAME object

        Person person1 = new Person("Anna");
        Person person2 = person1;

        person1.setName("Jane");
        System.out.println(person2.getName());

        // NEW object ONLY created when operator "new" is used
        // "new" operator allocates new memory

        // Arrays are referenced as well
        // arr2 is not new, it is a reference
        int [] arr1 = {1, 2};
        int [] arr2 = arr1;

        arr1[0] = 10;
        arr1[1] = 10;
        System.out.println(arr2[1]);

    }
}
