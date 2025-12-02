import java.util.Scanner;

public class question7 {
    public static double findAngle(int hour, int minute) {
        hour = hour % 12;

        double hourAngle = 0.5 * (60 * hour + minute);
        double minuteAngle = 6 * minute;

        double angle = Math.abs(hourAngle - minuteAngle);

        return Math.min(angle, 360 - angle);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours (0-12): ");
        int hour = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minute = sc.nextInt();

        double angle = findAngle(hour, minute);
        System.out.printf("Angle between hour and minute hands = %.2f degrees%n", angle);

        sc.close();
    }
}
