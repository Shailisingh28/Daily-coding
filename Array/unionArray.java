package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class unionArray {
    public static int[] unionArray(int arr1[], int arr2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                i++;
                j++;
            }

        }
        while (i < arr1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i++]);
            }
        }
        while (j < arr2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j++]);
            }
        }
        int ans[] = new int[list.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = list.get(k);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = { 1, 2, 7 };
        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
    }
}
