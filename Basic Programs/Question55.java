import java.util.Scanner;

public class Question55 {

    static boolean nextPermutation(char[] arr) {

        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i+1])
            i--;

        if(i < 0)
            return false;

        int j = arr.length - 1;
        while(arr[j] <= arr[i])
            j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i+1, arr.length-1);
        return true;
    }

    static void reverse(char[] arr, int start, int end) {
        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        char[] arr = str.toCharArray();

        if(nextPermutation(arr))
            System.out.println("Next Lexicographical String: " + new String(arr));
        else
            System.out.println("No higher permutation exists");

        sc.close();
    }
}