import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        if(hour == 12)
            hour = 0;

        double hourAngle = (hour * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(angle, 360 - angle);

        System.out.println("Angle between hands: " + angle);

        sc.close();
    }
}