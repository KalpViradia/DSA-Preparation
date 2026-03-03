import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Not Kaprekar Number");
            sc.close();
            return;
        }

        long square = (long) n * n;
        String str = String.valueOf(square);

        boolean isKaprekar = false;

        for(int i = 1; i < str.length(); i++) {
            long left = Long.parseLong(str.substring(0, i));
            long right = Long.parseLong(str.substring(i));

            if(right != 0 && left + right == n) {
                isKaprekar = true;
                break;
            }
        }

        if(n == 1)
            isKaprekar = true;

        if(isKaprekar)
            System.out.println(n + " is Kaprekar Number");
        else
            System.out.println(n + " is Not Kaprekar Number");

        sc.close();
    }
}