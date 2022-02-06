package simpleTest;

import org.testng.annotations.Test;

import javax.management.loading.MLetContent;
import java.util.Arrays;

import static interview.Anagram.isAnagram;
import static sun.security.util.Debug.args;
//import java.util.Collections.reverseOrder;

public class AzzaSecretLanguage {

    private MLetContent request;
    private Object String;

    @Test
    public void encryption() {

        String inputWord = "My name is";

        char[] chars = inputWord.toCharArray();

        for (int i = 0 ; i < chars.length-1; i++)

            System.out.print(chars[i] + "azza ");

    }

    @Test
    public void decryption() {

        String inputWord = "Wazza oazza razza lazza dazza";

        String decryptFirstStep = inputWord.replace("azza", "");
        String decryptSecondStep = decryptFirstStep.replace(" ", "");

        System.out.print(decryptSecondStep);

    }

    @Test

    public void encrypted(){

        String inputWord = "This way";

        char[] mychars = inputWord.toCharArray();

        for(int i = 0; i < mychars.length; i++)

        System.out.print(mychars[i] + "assssa ");
    }

//    @Test
//
//    public void myMethod(){
//        String string1 = "HELLOOOO";
//        char[] theChar = string1.toCharArray();
//        char[] theeChar1 = new char[theChar.length];
//        char[] theeChar2 = new char[theChar.length];
//        for ( int i = 0; i<theChar.length; i++) {
//            theeChar2[i] = theeChar1[theChar[i] + "ppp "];
////            String q = String.valueOf(theChar[i] + "ttt ");
//        }
//        String q = new String(theChar);
//        System.out.println(q);
//
//
//    }

    @Test
    public void reveseString1(){
        String str = "abc";
        char[] orgArr = str.toCharArray();
        char[] revArr = new char[orgArr.length];
        for (int i = 0; i < orgArr.length;i++)
            revArr[i] = orgArr[orgArr.length - 1 - i];

        String revStr = new String(revArr);
        System.out.println(revStr);
    }

    @Test
    public void encryption3333() {

        String inputWord = "My name is";

        char[] char1 = inputWord.toCharArray();
        char[] char2 = new char[char1.length];
        int q = char1.length;
        char[] char3 = new char[]{'a', 'a', 'a', 'a','a', 'a','a', 'a',};


        for (int i = 0 ; i < char1.length-1; i++)
            char2[i] = char1[i] + char3[i];
    }


}
