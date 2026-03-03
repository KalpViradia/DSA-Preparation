import java.util.*;

public class Question4 {

    static class Item {
        int price;
        String category;

        Item(int p, String c) {
            price = p;
            category = c;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (items to select): ");
        int N = sc.nextInt();
        System.out.print("Enter K (max per category): ");
        int K = sc.nextInt();
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        List<Item> items = new ArrayList<>();

        System.out.println("Enter " + n + " items (price:category):");
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            String[] parts = input.split(":");
            items.add(new Item(Integer.parseInt(parts[0]), parts[1]));
        }

        items.sort((a, b) -> b.price - a.price);

        Map<String, Integer> countMap = new HashMap<>();
        int total = 0, selected = 0;

        for (Item item : items) {

            if (selected == N)
                break;

            int count = countMap.getOrDefault(item.category, 0);

            if (count < K) {
                total += item.price;
                countMap.put(item.category, count + 1);
                selected++;
            }
        }

        System.out.println("Maximum Price = " + total);

        sc.close();
    }
}