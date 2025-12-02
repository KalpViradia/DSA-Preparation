import java.util.*;

public class question34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        if (set.size() == 1) {
            System.out.println("There is no second largest element.");
        }
        else {
            System.out.println("Second largest element is: " + list.get(list.size() - 2));
        }

        sc.close();
    }
}
