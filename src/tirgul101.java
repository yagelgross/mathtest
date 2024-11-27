


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

public class tirgul101 {
    public static void main(String[] args) {
        String str = "Blah" + " blah \n blah";
        str.substring (1,4);
        String str1 = "abcdet";
        String str2 = "abcdet";
        System.out.println(str);
        String[] arr = str1.split("b");
        System.out.println(Arrays.toString(arr));
        str.indexOf("blah");
        System.out.println(str.indexOf("blah"));
        char chararr = str2.charAt(3);
        System.out.println(chararr);
        String str4 = "abcd abcde @";
        char ch = 'e';
        int i = ch;
        char num = 'd' - 'a';
        double t = 5.8956789999999999;
        System.out.printf("my num: %.2f",t);
        if (ch >= 'a' &&  ch <= 'z'){
            System.out.println(i);
        } else {
            System.out.println(ch);
        }
        StringBuilder stg = new StringBuilder();
        stg.append("asdf");
        stg.append("asdfrtyui");
        System.out.println(stg);
        for (int j = 0; j < 10; j++) {
            stg.append(j == 0 ? "a" : "b");
        }
        System.out.println(stg);
        System.out.println(isEven(5));

    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static double Question_1( double a) {
        int i = (int) (Math.random() * 100);
        int j = (int) (Math.random() * 100);
        float s = 100/13;
        double s2 = 0;
        System.out.println(i + " * " + j + " = ?");
        System.out.println(" a) " + i*j + "\n b) " + i+j + "\n c) " + 1234 + "\n d) " + 4563);
        System.out.println("Please input the correct letter for the answer.");
        char answer1 = new Scanner(System.in).next().charAt(0);
        if (answer1 == 'a'){
            return a = s;
        } else {
            return s2;
        }
    }
}
