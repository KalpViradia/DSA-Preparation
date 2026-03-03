import java.util.Scanner;

public class Question58 {

    static String[] numbers = {
        "zero","one","two","three","four","five","six","seven","eight","nine","ten",
        "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
        "eighteen","nineteen","twenty","twenty-one","twenty-two","twenty-three",
        "twenty-four","twenty-five","twenty-six","twenty-seven","twenty-eight",
        "twenty-nine"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (1-12): ");
        int h = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int m = sc.nextInt();

        if (m == 0) {
            System.out.println(numbers[h] + " o' clock");
        } else if (m == 15) {
            System.out.println("quarter past " + numbers[h]);
        } else if (m == 30) {
            System.out.println("half past " + numbers[h]);
        } else if (m == 45) {
            System.out.println("quarter to " + numbers[h % 12 + 1]);
        } else if (m < 30) {
            System.out.println(numbers[m] + (m == 1 ? " minute past " : " minutes past ") + numbers[h]);
        } else {
            int remaining = 60 - m;
            System.out.println(numbers[remaining] + (remaining == 1 ? " minute to " : " minutes to ") + numbers[h % 12 + 1]);
        }

        sc.close();
    }
}