import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean isPronic = false;

        for(int k = 0; k <= Math.sqrt(n); k++) {
            if(k * (k + 1) == n) {
                isPronic = true;
                break;
            }
        }

        if(isPronic)
            System.out.println(n + " is Pronic Number");
        else
            System.out.println(n + " is Not Pronic Number");

        sc.close();
    }
}