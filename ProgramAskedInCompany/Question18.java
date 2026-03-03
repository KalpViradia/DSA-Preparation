import java.util.*;

public class Question18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                sum += i;
                if (i != num / i)
                    sum += num / i;
            }
        }

        if (num > 1 && sum == num)
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}