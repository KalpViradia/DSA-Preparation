import java.util.*;

class Time {

    int hr, min, sec;

    Time(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    void adjustTime() {
        if (sec >= 60) {
            min += sec / 60;
            sec %= 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min %= 60;
        }
        if (sec < 0) {
            min -= 1;
            sec += 60;
        }
        if (min < 0) {
            hr -= 1;
            min += 60;
        }
    }

    void addSeconds(int seconds) {
        sec += seconds;
        adjustTime();
    }

    void subtractSeconds(int seconds) {
        sec -= seconds;
        adjustTime();
    }

    void display(String message) {
        System.out.printf("%s = %02d : %02d : %02d\n", message, hr, min, sec);
    }
}

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        Time t = new Time(h, m, s);

        System.out.print("Enter seconds to add: ");
        int add = sc.nextInt();
        t.addSeconds(add);
        t.display("Time after adding seconds");

        System.out.print("Enter seconds to subtract: ");
        int sub = sc.nextInt();
        t.subtractSeconds(sub);
        t.display("Time after subtracting seconds");

        sc.close();
    }
}