package BasicPrograms;
import java.util.Arrays;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {2,2, 2, 52, 32, 45, 33, 89, 89};

       
        Arrays.sort(arr);
     
        int smallest = arr[0];
        int secondSmallest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                 secondSmallest = arr[i];
                break;
            }
        }

        // Step 3: Find second largest
        int largest = arr[arr.length - 1];
        int secondLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondSmallest == -1 || secondLargest == -1) {
            System.out.println("Not enough unique elements.");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
