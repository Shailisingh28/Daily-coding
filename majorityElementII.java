import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElementII {
    public static List<Integer> majorityElementII(int arr[]) {
        // int n = arr.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // for (int e : arr) {
        // map.put(e, map.getOrDefault(e, 0) + 1);
        // if (map.get(e) > n / 3) {
        // if (!list.contains(e)) {
        // list.add(e);
        // }
        // if (list.size() == 2) {
        // break;
        // }
        // }
        // }
        // return list;
        List<Integer> list = new ArrayList<>();
        int count1 = 0;
        int candidate1 = 0;
        int count2 = 0;
        int candidate2 = 0;
        for (int e : arr) {
            if (count1 == 0 && e != candidate2) {
                count1++;
                candidate1 = e;
            } else if (count2 == 0 && e != candidate1) {
                count2++;
                candidate2 = e;
            } else if (e == candidate1) {
                count1++;
            } else if (e == candidate2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int e : arr) {
            if (e == candidate1) {
                count1++;
            } else if (e == candidate2) {
                count2++;
            }
        }
        if (count1 > arr.length / 3) {
            list.add(candidate1);
        }
        if (count2 > arr.length / 3) {
            list.add(candidate2);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElementII(nums));

    }
}
