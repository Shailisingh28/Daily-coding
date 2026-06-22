package Array;

import java.util.ArrayList;

public class isSorted {
    // public static boolean isSorted(int arr[]) {
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i - 1] > arr[i])
    // return false;
    // }
    // return true;
    // }
    public static boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) > arr.get(i))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(nums));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(isSorted(arrayList));

    }
}
