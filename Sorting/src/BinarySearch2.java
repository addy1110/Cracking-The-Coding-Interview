import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ADDY on 24/03/17.
 * src: http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
public class BinarySearch2 {

    public static int getPivot(int[] array, int low, int high){
        if (high < low)  return -1;
        if (high == low) return low;

        int mid = (low + high)/2;
        if (mid < high && array[mid] > array[mid + 1])
            return mid;
        if (mid > low && array[mid] < array[mid - 1])
            return (mid-1);
        if (array[low] >= array[mid])
            return getPivot(array, low, mid-1);
        return getPivot(array, mid + 1, high);
    }

    public static int pivotedBinarySearch(int[] array,int n,int key){
        int pivot = getPivot(array, 0, n);
        if (pivot == -1)
            return BinarySearch.binarySearch(array, 0, n, key);
        if (array[pivot] == key)
            return pivot+1;
        if (array[0] <= key)
            return BinarySearch.binarySearch(array, 0, pivot, key);
        return BinarySearch.binarySearch(array, pivot, n, key);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];

        for(int i=0;i<length;i++){
            array[i] = in.nextInt();
        }

        int item = in.nextInt();

        System.out.println(pivotedBinarySearch(array, length, item));
    }
}
