package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        Integer[]numbers = {1,2,56,4,34,2,56,2,79,4,1,70,70,45,21,44,32,3,634,32};
        Set<Integer> set = new HashSet<>(Arrays.asList(numbers));

        for (Integer number: set){
            int count = 0;
            for (Integer v:numbers){
                if(number==v){
                    count++;
                }
            }
            if (count>1){
                System.out.println(number);
            }
        }
    }
}
