
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter number to find frequency");
            int num = sc.nextInt();
            if (num >= 0 && num < 13) {
                System.out.println(hash[num]);
            } else {
                System.out.println("Number out of range");
            }
        }
    }
}
