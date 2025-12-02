import java.util.Scanner;

public class question41 {
    public static int hanoiMoves(int n, char from, char to, char aux) {
        if (n == 0) return 0; // Base case: no disk

        int moves = 0;

        // Move n-1 disks from 'from' to 'aux'
        moves += hanoiMoves(n - 1, from, aux, to);

        // Move nth disk from 'from' to 'to'
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        moves++;

        // Move n-1 disks from 'aux' to 'to'
        moves += hanoiMoves(n - 1, aux, to, from);

        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        System.out.print("Enter the name/number of starting rod: ");
        char fromRod = sc.next().charAt(0);

        System.out.print("Enter the name/number of target rod: ");
        char toRod = sc.next().charAt(0);

        System.out.print("Enter the name/number of auxiliary rod: ");
        char auxRod = sc.next().charAt(0);

        int totalMoves = hanoiMoves(n, fromRod, toRod, auxRod);
        System.out.println("Total moves required: " + totalMoves);

        sc.close();
    }
}
