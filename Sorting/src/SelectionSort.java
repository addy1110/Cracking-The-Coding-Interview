/**
 * Created by ADDY on 01/10/17.
 * src: https://en.wikipedia.org/wiki/Selection_sort
 * Time Complexity: O(n*n)
 * Length of Array: 100000
 * Number of Swaps: 100000
 * Execution Time: 11.88200 seconds (Algorithm)
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

class SelectionSort {
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

        int i,j,min,temp, numberOfSwaps=0;
        for(i=0;i<lengthOfArray;i++){
            min=i;
            for(j=i+1;j<lengthOfArray;j++) {
                if (array[j] < array[min]) min = j;
            }
            //swap elements
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            numberOfSwaps++;
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");

//        for(int item: array) System.out.print(item+" ");
//        System.out.println("\nArray is sorted in "+numberOfSwaps+" swaps.");


    }
}
