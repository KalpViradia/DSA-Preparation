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
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        System.out.println("Enter " + n + " sentences:");
        for (int i = 0; i < n; i++)
            sentences[i] = sc.nextLine();

        Map<String, Integer> scoreMap = new HashMap<>();

        // Calculate similarity scores
        for (String s : sentences)
            scoreMap.put(s, calculateScore(s, secret));

        // Sort sentences in descending order of similarity
        Arrays.sort(sentences, (a, b) ->
                Integer.compare(scoreMap.get(b), scoreMap.get(a)));

        // Join sorted sentences into final decoded string
        String finalDecodedString = String.join(" ", sentences);

        System.out.println("\nFinal Decoded String:");
        System.out.println(finalDecodedString);

        sc.close();
    }
}
