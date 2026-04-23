package Recursion;

import java.util.ArrayList;
import java.util.List;

public class powerSet {
    public static List<List<Integer>> powerset(int arr[]) {
        List<List<Integer>> result = new ArrayList<>();
        generate(arr, 0, new ArrayList<>(), result);
        return result;
    }

    public static void generate(int arr[], int i, List<Integer> list, List<List<Integer>> resul) {
        if (i == arr.length) {
            resul.add(new ArrayList(list));
            return;
        }
        list.add(arr[i]);
        generate(arr, i + 1, list, resul);
        list.remove(list.size() - 1);
        generate(arr, i + 1, list, resul);
        // left.addAll(right);
        // return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        System.out.println(powerset(arr));
    }
}
