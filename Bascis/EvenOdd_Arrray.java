import java.util.*;

class EvenOdd_Arrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] even = new int[10];
        int[] odd = new int[10];
        int i, j = 0, k = 0;
        System.out.println("Enter 10 array elements:");
        for (i = 0; i < 10; i++) {
            System.out.print("Enter element arr[" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                even[j] = arr[i];
                j++;
            } else {
                odd[k] = arr[i];
                k++;
            }
        }
        System.out.println("Even elements are:");
        for (i = 0; i < j; i++) {
            System.out.print(even[i]);
            System.out.print(" ");
        }
        System.out.println("\nOdd elements are:");
        for (i = 0; i < k; i++) {
            System.out.print(odd[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}