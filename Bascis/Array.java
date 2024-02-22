
//WAP to insert elements in an array and delete an element from an array at specified position.

import java.util.Scanner;
import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i, pos;
        System.out.println("Enter 10 array elements:");
        for (i = 0; i < 10; i++) {
            System.out.print("Enter element arr[" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position of element to be deleted:");
        pos = sc.nextInt();
        sc.close();

        if (pos < 1 || pos > 10) {
            System.out.println("Invalid position. Element not deleted.");
        } else {
            for (i = pos - 1; i < 9; i++) {
                arr[i] = arr[i + 1];
            }

            // Resize the array
            arr = Arrays.copyOf(arr, 9);

            System.out.println("Array after deletion:");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }
}