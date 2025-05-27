package Coding_Round;

import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 9, 9};
        Arrays.sort(arr);

        int smallest = arr[0], secondSmallest = -1;
        int largest = arr[arr.length - 1], secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
