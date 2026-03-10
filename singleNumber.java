import java.util.Arrays;

public class singleNumber {
    public static int singleNumber(int arr[]) {
       int XOR=0;
       for(int e:arr)
       {
        XOR=XOR^e;
       }
       return XOR;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 3, 1, 4 };
        System.out.println(singleNumber(nums));
    }
}
