/**
 * Created by ADDY on 01/10/17.
 * src:
 * Time Complexity: O(n*n)
 * Length of Array: 100000
 * Number of Swaps: 100000 (Worst Case)
 * Execution Time: 11.88200 seconds (Algorithm)
 */
import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthOfArray = in.nextInt();
        int[] array = new int[lengthOfArray];
        for(int l=0;l<lengthOfArray;l++){
            array[l] = in.nextInt();
        }
        in.close();
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

        for(int item: array) System.out.print(item+" ");
        System.out.println("\nArray is sorted in "+numberOfSwaps+" swaps.");


    }
}
