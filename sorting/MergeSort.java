public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        // Merge both halves into temp
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Copy remaining elements from the left half
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Copy remaining elements from the right half
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy sorted elements back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 8, 5, 3, 1, 9, 7, 2, 4};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
