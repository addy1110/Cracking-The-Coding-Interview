import java.util.Scanner;
/**
 * Created by ADDY on 24/03/17.
 * src: http://quiz.geeksforgeeks.org/binary-search/
 */

public class BinarySearch {

    public static int binarySearch(int[] array, int low, int high, int item){
        if(high<low) throw new ArrayStoreException("Array Does not exist");
        while(low<=high){
        int mid = (low+high)/2;
        if(item<array[mid])  high=mid-1;
        else if(item>array[mid]) low=mid+1;
        else return mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];

        for(int i=0;i<length;i++){
            array[i] = in.nextInt();
        }

        int item = in.nextInt();

        System.out.println(binarySearch(array,0,length,item));
        in.close();


    }
}
