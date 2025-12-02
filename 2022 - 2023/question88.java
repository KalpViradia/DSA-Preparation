import java.util.*;

public class question88 {

    static class Item {
        int p, w;
        double ratio;
        Item(int p, int w) {
            this.p = p;
            this.w = w;
            this.ratio = (double)p / w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] p = {10,5,15,7,6,18,3};
        int[] w = {2,3,5,7,1,4,1};

        int n = 7;
        int M = 15;

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) items[i] = new Item(p[i], w[i]);

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double profit = 0;
        int cap = M;

        for (Item it : items) {
            if (cap >= it.w) {
                profit += it.p;
                cap -= it.w;
            } else {
                profit += it.ratio * cap;
                break;
            }
        }

        System.out.println("Max Profit = " + profit);

        sc.close();
    }
}
