
import java.util.*;

public class Selection {
    public static void main(String args[]) {
        int arr[] = { 6, 5, 4, 3, 2, 1 };

        selectionSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }

            int t = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = t;
        }
    }
}
