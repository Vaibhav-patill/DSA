public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // Calculate mid point
        mergeSort(arr, si, mid); // Left part
        mergeSort(arr, mid + 1, ei); // Right part
        merge(arr, si, mid, ei);
    }

    public static int[] merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // index for the left subarray
        int j = mid + 1; // index for the right subarray
        int k = 0; // index for the temp array

        // Merge the two sorted halves
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements from temp back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
