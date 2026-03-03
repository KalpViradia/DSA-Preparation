import java.util.*;

public class Question31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] red = new int[n];
        int[] blue = new int[n];

        System.out.println("Enter red block heights:");
        for (int i = 0; i < n; i++)
            red[i] = sc.nextInt();

        System.out.println("Enter blue block heights:");
        for (int i = 0; i < n; i++)
            blue[i] = sc.nextInt();

        int totalRedStart = 0;
        int totalBlueStart = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                totalRedStart += red[i];
                totalBlueStart += blue[i];
            } else {
                totalRedStart += blue[i];
                totalBlueStart += red[i];
            }
        }

        System.out.println("Maximum Height: " +
                Math.max(totalRedStart, totalBlueStart));

        sc.close();
    }
}