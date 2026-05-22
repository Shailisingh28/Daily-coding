package stack_queue.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asteroidCollision {
    public static int[] asteroidCollision(int arr[]) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(arr[i]);
            } else {
                while (!ans.isEmpty() && ans.get(ans.size() - 1) > 0 && ans.get(ans.size() - 1) < Math.abs(arr[i])) {
                    ans.remove(ans.size() - 1);
                }
                if (ans.isEmpty() || ans.get(ans.size() - 1) < 0) {
                    ans.add(arr[i]);
                } else if (ans.get(ans.size() - 1) == Math.abs(arr[i])) {
                    ans.remove(ans.size() - 1);
                    continue;
                }
            }
        }
        int result[] = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
