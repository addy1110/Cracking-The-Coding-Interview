/**
 * Created by ADDY on 10/01/17.
 * src: https://en.wikipedia.org/wiki/Insertion_sort
 * Time Complexity: O(n*n)
 * Length of Array: 100000
 * Number of Swaps: 704982704
 * Execution Time:  3.69700 seconds (Algorithm)
 */
import java.util.Scanner;
class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthOfArray = in.nextInt();
        int[] array = new int[lengthOfArray];
        for(int l=0;l<lengthOfArray;l++){
            array[l] = in.nextInt();
        }
        in.close();
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
        for(int item: array) System.out.print(item+" ");
        System.out.println("\nArray is sorted in "+numberOfSwaps+" swaps.");

    }
}
