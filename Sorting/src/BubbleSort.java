/**
 * Created by ADDY on 09/01/17.
 * src: https://www.hackerrank.com/challenges/ctci-bubble-sort
 * Time Complexity: O(n*n)
 * Length of Array: 100000
 * Number of Swaps: 704982704 (Worst Case)
 * Execution Time: 5.45200 seconds
 */

import java.util.Scanner;
class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthOfArray = in.nextInt();
        int[] array = new int[lengthOfArray];
        for(int i=0;i<lengthOfArray;i++){
            array[i] = in.nextInt();
        }
        in.close();

        int numberOfSwaps=0;
        for (int i=0;i<lengthOfArray;i++){
            for(int j=0;j<lengthOfArray-1-i;j++){
                if (array[j] > array[j + 1]) {
                    int temp=array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    numberOfSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+array[0]);
        System.out.println("Last Element: "+array[lengthOfArray-1]);
    }
}
