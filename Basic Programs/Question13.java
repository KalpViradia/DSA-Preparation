import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        long square = (long) n * n;

        String numStr = String.valueOf(n);
        String squareStr = String.valueOf(square);

        if(squareStr.endsWith(numStr))
            System.out.println(n + " is Automorphic Number");
        else
            System.out.println(n + " is Not Automorphic Number");

        sc.close();
    }
}