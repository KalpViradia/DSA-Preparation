import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (1-12): ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();

        if (hours < 1 || hours > 12 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid input. Hours must be 1-12 and minutes 0-59.");
            sc.close();
            return;
        }

        // Calculate the angles
        double hourAngle = (hours % 12) * 30 + (minutes * 0.5);  // 30° per hour + 0.5° per minute
        double minuteAngle = minutes * 6;                        // 6° per minute

        double angle = Math.abs(hourAngle - minuteAngle);        // Difference between two angles
        if (angle > 180) {
            angle = 360 - angle;  // Take the smaller angle
        }

        System.out.println("Angle between hour and minute hand = " + angle + " degrees.");

        sc.close();
    }
}
