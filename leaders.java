import java.util.ArrayList;
import java.util.List;

public class leaders {
    public static List<Integer> leaders(int arr[]) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 1, 2 };
        System.out.println(leaders(nums));
    }
}
