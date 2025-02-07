import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 1, 1, 0, 2, 1, 0};
        colorSort(arr);
        System.out.println(Arrays.toString(arr)); // Should print [0, 0, 0, 1, 1, 1, 2, 2, 2]
    }

    public static void colorSort(int[] arr) {
        int start = 0, mid = 0, end = arr.length - 1;
        
        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, end);
                end--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
