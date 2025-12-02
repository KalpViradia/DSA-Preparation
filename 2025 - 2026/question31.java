import java.util.Scanner;

public class question31 {
    static char findEarliestRepeated(String s) {
        int[] firstIndex = new int[256]; // For ASCII characters
        int n = s.length();
        for (int i = 0; i < 256; i++) {
            firstIndex[i] = -1; // Initialize as not seen
        }

        int minSecondIndex = n; // Initialize with max possible index
        char earliestChar = '\0';

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (firstIndex[ch] == -1) {
                firstIndex[ch] = i; // first occurrence
            } else {
                // repeated character
                if (i < minSecondIndex) {
                    minSecondIndex = i;
                    earliestChar = ch;
                }
            }
        }

        return earliestChar; // returns '\0' if no repeated char
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        char result = findEarliestRepeated(s);

        if (result != '\0') {
            System.out.println("Earliest repeated character: " + result);
        } else {
            System.out.println("No repeated character found.");
        }

        sc.close();
    }
}
