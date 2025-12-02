import java.util.*;

public class question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Step 1: Sort digits in ascending order (for easy removal)
        Arrays.sort(digits);

        // Step 2: Find total sum
        int sum = 0;
        for (int d : digits) sum += d;

        int rem = sum % 3;

        // Step 3: Adjust digits based on remainder
        if (rem != 0) {
            boolean removed = false;

            // Try to remove one smallest digit with remainder 'rem'
            for (int i = 0; i < n; i++) {
                if (digits[i] % 3 == rem) {
                    digits[i] = -1; // mark as removed
                    removed = true;
                    break;
                }
            }

            // If not found, remove two smallest digits with remainder (3 - rem)
            if (!removed) {
                int count = 0;
                for (int i = 0; i < n && count < 2; i++) {
                    if (digits[i] % 3 == (3 - rem)) {
                        digits[i] = -1;
                        count++;
                    }
                }
            }
        }

        // Step 4: Collect remaining digits
        ArrayList<Integer> remaining = new ArrayList<>();
        for (int d : digits) {
            if (d != -1) remaining.add(d);
        }

        if (remaining.size() == 0) {
            System.out.println("Not possible to form a number divisible by 3");
            sc.close();
            return;
        }

        // Step 5: Sort descending to form largest number
        remaining.sort(Collections.reverseOrder());

        // Step 6: Handle all zeros case
        if (remaining.get(0) == 0) {
            System.out.println("Largest number divisible by 3: 0");
        } else {
            System.out.print("Largest number divisible by 3: ");
            for (int d : remaining) {
                System.out.print(d);
            }
            System.out.println();
        }

        sc.close();
    }
}
