import java.util.*;

public class Question55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression (numbers separated by +): ");
        String input = sc.nextLine();

        String[] parts = input.split("\\+");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(numbers);

        System.out.print("Sorted expression: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1)
                System.out.print("+");
        }

        sc.close();
    }
}