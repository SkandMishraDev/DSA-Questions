public class FloorCeil {
    public static int[] findFloorCeil(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int floor = Integer.MIN_VALUE; // Default floor value
        int ceil = Integer.MAX_VALUE; // Default ceil value

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                floor = arr[mid];
                ceil = arr[mid];
                break; // Found exact match
            } else if (arr[mid] > x) {
                ceil = arr[mid]; // Update ceil
                high = mid - 1;  // Search in the left half
            } else {
                floor = arr[mid]; // Update floor
                low = mid + 1;    // Search in the right half
            }
        }
        return new int[]{floor, ceil}; // Return both floor and ceil
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 25, 30, 40};
        int val = 25;
        int[] result = findFloorCeil(arr, val);
        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}
