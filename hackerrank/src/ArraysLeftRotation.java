/**
 * Created by ADDY on 09/01/17.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraysLeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            int newLocation = (a_i + (n - k)) % n;
            a[newLocation] = in.nextInt();
        }
        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++)
        System.out.print(a[i]+" ");

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");


    }

}
