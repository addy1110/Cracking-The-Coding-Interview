/**
 * Created by ADDY on 25/02/17.
 * src: https://en.wikipedia.org/wiki/Quicksort
 * Time Complexity(avg): O(n*logn)
 * Length of Array: 10,000,000
 * Execution Time:  0.485 seconds (Algorithm)
 *
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class QuickSort {

    private int[] a;

    public QuickSort(int[] ar){
        this.a = ar;
    }

    private void swap(int i, int j){
        int temp = this.a[i];
        this.a[i] = this.a[j];
        this.a[j] = temp;
    }

    private void printArray(){

        for(int element: this.a){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    private void quickSort(int low, int high){
        int i = low;
        int j = high;
        int pivot = this.a[low + (high-low)/2];

        while(i<=j){
            while (this.a[i] < pivot) {
                i++;
            }
            while (this.a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i,j);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);

    }

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = in.nextInt();
        }

        QuickSort qs = new QuickSort(arr);

        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        qs.quickSort(0, len-1);

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");
        //qs.printArray();
        in.close();
    }
}
