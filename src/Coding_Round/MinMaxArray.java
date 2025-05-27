package Coding_Round;
public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9};
        findMinMax(arr);
    }

    public static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}