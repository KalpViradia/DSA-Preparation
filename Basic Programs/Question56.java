// import java.util.Scanner;

// public class Question56 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter binary string: ");
//         String s = sc.next();

//         long count = 0;
//         int n = s.length();

//         for(int i = 0; i < n; i++) {
//             for(int j = i+1; j < n; j++) {
//                 for(int k = j+1; k < n; k++) {

//                     char a = s.charAt(i);
//                     char b = s.charAt(j);
//                     char c = s.charAt(k);

//                     if(a != b && b != c)
//                         count++;
//                 }
//             }
//         }

//         System.out.println("Number of valid ways: " + count);

//         sc.close();
//     }
// }


// efficient way

import java.util.Scanner;

public class Question56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.next();

        long count = 0;
        int n = s.length();

        long totalZeros = 0, totalOnes = 0;

        // Count total zeros and ones
        for (char ch : s.toCharArray()) {
            if (ch == '0')
                totalZeros++;
            else
                totalOnes++;
        }

        long leftZeros = 0, leftOnes = 0;

        for (int j = 0; j < n; j++) {

            char ch = s.charAt(j);

            if (ch == '0') {

                long rightOnes = totalOnes - leftOnes;
                count += leftOnes * rightOnes;

                leftZeros++;

            } else {

                long rightZeros = totalZeros - leftZeros;
                count += leftZeros * rightZeros;

                leftOnes++;
            }
        }

        System.out.println("Number of valid ways: " + count);
        sc.close();
    }
}