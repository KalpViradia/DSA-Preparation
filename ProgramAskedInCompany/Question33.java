import java.util.*;

public class Question33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 30)
            bill = units * 2.70;
        else if (units <= 100)
            bill = 30 * 2.70 + (units - 30) * 4.00;
        else if (units <= 200)
            bill = 30 * 2.70 + 70 * 4.00 +
                    (units - 100) * 5.40;
        else
            bill = 30 * 2.70 + 70 * 4.00 +
                    100 * 5.40 + (units - 200) * 6.40;

        if (bill < 125)
            bill = 125;

        System.out.println("Bill amount = ₹" + bill);

        sc.close();
    }
}