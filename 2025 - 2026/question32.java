import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question32 {
    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            if (!countMap.containsKey(ch)) {
                return false;
            }
            countMap.put(ch, countMap.get(ch) - 1);
            if (countMap.get(ch) == 0) {
                countMap.remove(ch);
            }
        }

        return countMap.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String one: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String two: ");
        String s2 = sc.nextLine();

        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}
