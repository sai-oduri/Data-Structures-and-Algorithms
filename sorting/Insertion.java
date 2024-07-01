import java.util.*;

public class Insertion {
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };

        insertionSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int t = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = t;
                j--;
            }
        }
    }
}
