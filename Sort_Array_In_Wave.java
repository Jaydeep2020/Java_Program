code - 1)

import java.util.Arrays;

class WaveSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Expected output: [2, 1, 4, 3, 6, 5]
        waveSort(arr);
        System.out.println("Wave Sorted Array: " + Arrays.toString(arr));
    }

    public static void waveSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i += 2) {
            if (arr[i] > arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            if (i + 1 < length && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}


code - 2)

// Java implementation of naive method for sorting
// an array in wave form.
import java.util.*;

class SortWave
{
    // A utility method to swap two numbers.
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    void sortInWave(int arr[], int n)
    {
        // Sort the input array
        Arrays.sort(arr);

        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }

    // Driver method
    public static void main(String args[])
    {
        SortWave ob = new SortWave();
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
