import java.util.Scanner;

public class Question61 {

    static boolean isAlphabet(char ch) {
        return (Character.isLetter(ch));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            if(!isAlphabet(arr[left]))
                left++;
            else if(!isAlphabet(arr[right]))
                right--;
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Reversed String: " + new String(arr));

        sc.close();
    }
}