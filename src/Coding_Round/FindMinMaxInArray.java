package Coding_Round;

import java.util.Arrays;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3};
        Arrays.sort(array);
        System.out.println("Min: " + array[0]);
        System.out.println("Max: " + array[array.length - 1]);
    }
}
