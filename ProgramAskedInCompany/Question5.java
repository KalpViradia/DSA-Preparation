import java.util.*;

public class Question5 {

    static int calculateScore(String sentence, String secret) {

        String[] words = sentence.split(" ");
        int score = 0;

        for (String word : words) {

            if (word.length() == secret.length()) {

                for (int i = 0; i < secret.length(); i++) {
                    if (Character.toLowerCase(word.charAt(i)) ==
                        Character.toLowerCase(secret.charAt(i))) {
                        score++;
                    }
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret word: ");
        String secret = sc.nextLine();
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " sentences:");
        String[] sentences = new String[n];
        for (int i = 0; i < n; i++)
            sentences[i] = sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for (String s : sentences)
            map.put(s, calculateScore(s, secret));

        Arrays.sort(sentences, (a, b) -> map.get(b) - map.get(a));

        for (String s : sentences)
            System.out.print(s + " ");

        sc.close();
    }
}