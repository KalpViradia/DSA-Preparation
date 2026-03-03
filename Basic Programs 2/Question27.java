import java.util.*;

public class Question27 {

    static class Item {
        int profit, weight;
        double ratio;

        Item(int p, int w) {
            profit = p;
            weight = w;
            ratio = (double) p / w;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        Item[] items = new Item[n];

        System.out.println("Enter " + n + " items (profit weight):");
        for (int i = 0; i < n; i++) {
            int profit = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Item(profit, weight);
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {
                totalProfit += item.profit;
                capacity -= item.weight;
            } else {
                totalProfit += item.ratio * capacity;
                break;
            }
        }

        System.out.println(totalProfit);

        sc.close();
    }
}