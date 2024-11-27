import java.util.Scanner;

public class Math_test {
    public static void main(String[] args) {
        System.out.println(" This is a third grade math test.");
        System.out.println(" Please remember to ignore the remainder unless told otherwise.");
        System.out.println(" Please maintain the required integrity \n by not using outside help during the \n test. Thank you and good luck!");

        Scanner scanner = new Scanner(System.in);
        double score = 0.0;
        int correct_answers = 0;
        int i = (int) (Math.random() * 100);
        int j = (int) (Math.random() * 100);
        System.out.println(" 1) " + i + " * " + j + " = ?");
        System.out.println(" a) " + i*j + "\n b) " + i+j + "\n c) " + 687 + "\n d) " + 4563);
        System.out.println("Please input the correct letter for the answer.");
        char answer1 = new Scanner(System.in).next().charAt(0);
        if (answer1 == 'a'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer1 == 'b'){
            score += 0;
        }
        else if (answer1 == 'c'){
            score += 0;
        }
        else if (answer1 == 'd'){
            score += 0;
        }
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        System.out.println(" 2) " + x + " + " + y + " = ?");
        System.out.println(" a) " + 4*y + "\n b) " + (x+y) + "\n c) " + x*y + "\n d) " + 2*y+x);
        System.out.println("Please input the correct letter for the answer.");
        char answer2 = new Scanner(System.in).next().charAt(0);
        if (answer2 == 'b'){
            score = score +(double) 100 /12;
            correct_answers++;
        }
        else if (answer2 == 'a'){
            score += 0;
        }
        else if (answer2 == 'c'){
            score += 0;
        }
        else if (answer2 == 'd'){
            score += 0;
        }
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println(" 3) " + a + " - " + b + " = ?");
        System.out.println(" a) " + a * b + "\n b) " + a + b + "\n c) " + 578 + "\n d) " + (a-b));
        System.out.println("Please input the correct letter for the answer.");
        char answer3 = new Scanner(System.in).next().charAt(0);
        if (answer3 == 'd'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer3 == 'b'){
            score += 0;
        }
        else if (answer3 == 'c'){
            score += 0;
        }
        else if (answer3 == 'a'){
            score += 0;
        }
        int c = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 100);
        System.out.println(" 4) " + c + " / " + d + " = ?");
        System.out.println(" a) " + c * d + "\n b) " + c + d + "\n c) " + (c / d) + "\n d) " + 4563);
        System.out.println("Please input the correct letter for the answer.");
        char answer4 = new Scanner(System.in).next().charAt(0);
        if (answer4 == 'c'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer4 == 'a'){
            score += 0;
        }
        else if (answer4 == 'b'){
            score += 0;
        }
        else if (answer4 == 'd'){
            score += 0;
        }
        int e = (int) (Math.random() * 100);
        int f = (int) (Math.random() * 100);
        System.out.println(" 5) " + e + " * " + e + " = ?");
        System.out.println(" a) " + e * f + "\n b) " + e + f + "\n c) " + (e / f) + "\n d) " + e*e);
        System.out.println("Please input the correct letter for the answer.");
        char answer5 = new Scanner(System.in).next().charAt(0);
        if (answer5 == 'd'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer5 == 'a'){
            score += 0;
        }
        else if (answer5 == 'c'){
            score += 0;
        }
        else if (answer5 == 'b'){
            score += 0;
        }
        int g = (int) (Math.random() * 100);
        int h = (int) (Math.random() * 100);
        System.out.println(" 6) " + g + " * " + h + " + " + h + " = ?");
        System.out.println(" a) " + (g * h + h) + "\n b) " + g + h + "\n c) " + (g / h) + "\n d) " + d * h);
        System.out.println("Please input the correct letter for the answer.");
        char answer6 = new Scanner(System.in).next().charAt(0);
        if (answer6 == 'a'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer6 == 'c'){
            score += 0;
        }
        else if (answer6 == 'b'){
            score += 0;
        }
        else if (answer6 == 'd'){
            score += 0;
        }
        int k = (int) (Math.random() * 100);
        int l = (int) (Math.random() * 100);
        System.out.println(" 7) " + k + " + " + k + " * " + l + " / 5 " + " = ?");
        System.out.println(" a) " + k * l + "\n b) " + (k + k * l ) / 5 + "\n c) " + (k / l) + "\n d) " + k*5+l);
        System.out.println("Please input the correct letter for the answer.");
        char answer7 = new Scanner(System.in).next().charAt(0);
        if (answer7 == 'b'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer7 == 'a'){
            score += 0;
        }
        else if (answer7 == 'c'){
            score += 0;
        }
        else if (answer7 == 'd'){
            score += 0;
        }
        int m = (int) (Math.random() * 100);
        int o = (int) (Math.random() * 100);
        System.out.println(" Please choose the correct remainder from the following division drills: ");
        System.out.println(" 8) " + m + " / " + o + " = ?" + "\n a) " + m % o + "\n b) " + m + o + "\n c) " + (m / o) + "\n d) " + (m- o));
        System.out.println("Please input the correct letter for the answer.");
        char answer8 = new Scanner(System.in).next().charAt(0);
        if (answer8 == 'a'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer8 == 'c'){
            score += 0;
        }
        else if (answer8 == 'b'){
            score += 0;
        }
        else if (answer8 == 'd'){
            score += 0;
        }
        int p = (int) (Math.random() * 100);
        int q = (int) (Math.random() * 100);
        System.out.println(" 9) " + p + " / " + q + " = ?" + "\n a) " + (p % 2 + q) + "\n b) " + (p - q) + "\n c) " + (p / q) + "\n d) " + (p % q));
        System.out.println("Please input the correct letter for the answer.");
        char answer9 = new Scanner(System.in).next().charAt(0);
        if (answer9 == 'd'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer9 == 'c'){
            score += 0;
        }
        else if (answer9 == 'b'){
            score += 0;
        }
        else if (answer9 == 'a'){
            score += 0;
        }
        int r = (int) (Math.random() * 100);
        int s = (int) (Math.random() * 100);
        System.out.println(" 10) " + r + " / " + s + " = ?" + "\n a) " + (r / s) + "\n b) " + r + s + "\n c) " + (r % s) + "\n d) " + (r - s));
        System.out.println("Please input the correct letter for the answer.");
        char answer10 = new Scanner(System.in).next().charAt(0);
        if (answer10 == 'c'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer10 == 'a'){
            score += 0;
        }
        else if (answer10 == 'b'){
            score += 0;
        }
        else if (answer10 == 'd'){
            score += 0;
        }
        int t = (int) (Math.random() * 100);
        int u = (int) (Math.random() * 100);
        System.out.println(" 11) " + t + " / " + u + " = ?" + "\n a) " + t + u + "\n b) " + (t % u) + "\n c) " + (t / u) + "\n d) " + (t - u));
        System.out.println("Please input the correct letter for the answer.");
        char answer11 = new Scanner(System.in).next().charAt(0);
        if (answer11 == 'b'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer11 == 'c'){
            score += 0;
        }
        else if (answer11 == 'a'){
            score += 0;
        }
        else if (answer11 == 'd'){
            score += 0;
        }
        int v = (int) (Math.random() * 100);
        int w = (int) (Math.random() * 100);
        System.out.println(" Please ignore the remainder for the final answer.");
        System.out.println(" 12) " + v + " * " + w + " / " + 17 + " = ?" + "\n a) " + v % w + "\n b) " + v + w + "\n c) " + (v / w) + "\n d) " + (v*w/17));
        System.out.println("Please input the correct letter for the answer.");
        char answer12 = new Scanner(System.in).next().charAt(0);
        if (answer12 == 'd'){
            score = score + (double) 100 /12;
            correct_answers++;
        }
        else if (answer12 == 'c'){
            score += 0;
        }
        else if (answer12 == 'b'){
            score += 0;
        }
        else if (answer12 == 'a'){
            score += 0;
        }
        System.out.println("Your score is " + score);
        System.out.println("You had " + correct_answers + " correct answers.");
    }
}
