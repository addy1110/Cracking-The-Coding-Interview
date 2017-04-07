import java.util.*;

/**
 * Created by ADDY on 06/04/17.
 */
public class FindDuplicates {

    static void printDuplicates(int[] arr){
        Set<Integer> detectDuplicates = new HashSet<>();
        HashSet<Integer> dups = new HashSet<>();

        for(int item: arr){
            if(!detectDuplicates.add(item)){
                dups.add(item);
            }
        }

        for(Integer duplicates: dups) System.out.print(duplicates+" ");
    }

    static HashMap<Integer,Integer> countDuplicates(int[] arr){

        HashMap<Integer,Integer> repetitions = new HashMap<>();
        for(int item: arr){
            if(repetitions.containsKey(item)) repetitions.put(item, repetitions.get(item)+1);
            else repetitions.put(item,1);
        }

        return repetitions;

    }

    public static void main(String[] args) {
        int[] arr = {2,6,9,1,4,8,2,5,3,10,6,7,2,5};
        //printDuplicates(arr);

        TreeSet<Integer> treeset = new TreeSet<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        for(int item: arr){
            treeset.add(item);
            treeMap.put(item,"value");
        }

        //System.out.println(treeset);
        //System.out.println(treeMap);

        countDuplicates(arr);
    }
}
