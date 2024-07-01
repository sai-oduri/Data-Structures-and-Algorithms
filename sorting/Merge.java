import java.util.*;

public class Merge {
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int arr[], int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> li = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                li.add(arr[left]);
                left++;
            } else {
                li.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            li.add(arr[left]);
            left++;
        }

        while (right <= high) {
            li.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = li.get(i - low);
        }
    }
}
