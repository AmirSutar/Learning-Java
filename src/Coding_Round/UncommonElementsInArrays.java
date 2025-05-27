package Coding_Round;

import java.util.*;

public class UncommonElementsInArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 6};
        Integer[] arr2 = {3, 4, 5};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        result.removeAll(intersection);
        System.out.println("Uncommon elements: " + result);
    }
}
