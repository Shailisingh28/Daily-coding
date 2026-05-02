package stack_queue;

import java.util.List;

public class twoStacks {
    public static int twoStacks(List<Integer> s1, List<Integer> s2, int max_sum) {
        int sum = 0;
        int count1 = 0;
        int count2 = 0;
        int result = 0;
        for (int e1 : s1) {
            if (sum + e1 > max_sum)
                break;
            sum += e1;
            count1++;
        }
        result = count1;
        for (int e2 : s2) {
            sum += e2;
            count2++;
            while (count1 > 0 && sum > max_sum) {
                count1--;
                sum -= s1.get(count1);
            }
            if (sum > max_sum)
                break;
            result = Math.max(count1 + count2, result);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> s1 = java.util.Arrays.asList(4, 2, 4, 6, 1);
        List<Integer> s2 = java.util.Arrays.asList(2, 1, 8, 5);
        int maxSum = 10;

        int result = twoStacks(s1, s2, maxSum);
        System.out.println("Maximum elements: " + result);
    }
}
