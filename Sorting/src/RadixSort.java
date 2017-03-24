/**
 * Created by ADDY on 26/02/17.
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class RadixSort {

    private static void sort(int[] a){
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[a.length];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[a.length];

            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int lengthOfArray = in.nextInt();
//        int[] array = new int[lengthOfArray];
//        for(int l=0;l<lengthOfArray;l++){
//            array[l] = in.nextInt();
//        }
//        in.close();

        int lengthOfArray = 10000000;
        int[] array = new int[lengthOfArray];
        int l=0;
        for(int i=lengthOfArray;i>0;i--){
            array[l] = i;
            l++;
        }

        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        sort(array);

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");

//        for(int i=0;i<lengthOfArray;i++){
//            System.out.print(array[i]+" ");
//        }
//        System.out.println();
    }
}
