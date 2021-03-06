/**
 * Created by ADDY on 10/01/17.
 * src: https://en.wikipedia.org/wiki/Insertion_sort
 * Time Complexity: O(n*n)
 * Length of Array: 100000
 * Number of Swaps: 704982704
 * Execution Time:  3.69700 seconds (Algorithm)
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
class InsertionSort {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int lengthOfArray = in.nextInt();
//        int[] array = new int[lengthOfArray];
//        for(int l=0;l<lengthOfArray;l++){
//            array[l] = in.nextInt();
//        }
//        in.close();

        int lengthOfArray = 100000;
        int[] array = new int[lengthOfArray];
        int l=0;
        for(int i=lengthOfArray;i>0;i--){
            array[l] = i;
            l++;
        }

        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        int i, j, v, numberOfSwaps=0;
        for(i = 1;i<lengthOfArray;i++){
            v = array[i];
            j=i;
            while(j>0 && array[j-1]>v ){
                array[j] = array[j-1];
                numberOfSwaps++;
                j--;
            }
            array[j]=v;
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");
//        for(int item: array) System.out.print(item+" ");
//        System.out.println("\nArray is sorted in "+numberOfSwaps+" swaps.");

    }
}
