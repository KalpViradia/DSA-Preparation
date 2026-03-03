import java.util.Scanner;

public class Question23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int length = 1;
        long count = 9;
        int start = 1;

        while(n > length * count) {
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / length;
        String num = String.valueOf(start);

        System.out.println("Nth digit: " + num.charAt((n - 1) % length));

        sc.close();
    }
}