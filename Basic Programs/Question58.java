import java.util.*;

public class Question58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter " + n + " strings:");
        for(int i = 0; i < n; i++)
            strs[i] = sc.nextLine();

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        System.out.println("Grouped Anagrams:");
        for(List<String> group : map.values())
            System.out.println(group);

        sc.close();
    }
}