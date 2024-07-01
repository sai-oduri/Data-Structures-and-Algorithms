import java.util.*;

public class Bubble {
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };

        bubbleSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
