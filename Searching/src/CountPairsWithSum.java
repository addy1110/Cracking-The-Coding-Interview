import java.util.HashMap;

/**
 * Created by ADDY on 06/04/17.
 * src: http://www.geeksforgeeks.org/count-pairs-with-given-sum/
 */
public class CountPairsWithSum {

    static int countPairs(int[] arr, int sum){
        int count=0;
        // get count of each occurrences
        HashMap<Integer,Integer> repititions = FindDuplicates.countDuplicates(arr);
        for(int i=0;i<arr.length;i++){
            count += repititions.get(sum-arr[i]);
            if(sum - arr[i] == arr[i]) count--;
        }
        return count/2;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,4,-3,9,3,3};

        System.out.println(countPairs(arr, 6));
    }
}
