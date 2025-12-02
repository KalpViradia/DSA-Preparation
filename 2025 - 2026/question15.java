import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("1");
            
            if (i == 2) {
                System.out.print(" 2 1");
            } else if (i >= 3) {
                // print left stars
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" *");
                }
                
                // print middle number
                System.out.print(" " + i);
                
                // print right stars
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" *");
                }
                
                // print last 1
                System.out.print(" 1");
            }
            
            System.out.println();
        }

        sc.close();
    }
}
