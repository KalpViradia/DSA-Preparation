import java.util.Scanner;

public class Question5 {

    static boolean isPrime(int num) {
        if(num <= 1)
            return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range: ");
        int start = sc.nextInt();
        System.out.print("Enter end range: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between range:");

        for(int i = start; i <= end; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }

        sc.close();
    }
}