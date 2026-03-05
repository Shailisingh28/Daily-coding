import java.util.Arrays;

public class secondLargestElement {
    public static int secondLargestElement(int arr[]) {
        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                seclargest = largest;
                largest = arr[i];
            } else {
                if (arr[i] != largest && arr[i] < seclargest) {
                    seclargest = arr[i];
                }
            }
        }
        return seclargest;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7 };
        System.out.println(secondLargestElement(arr));
    }
}
