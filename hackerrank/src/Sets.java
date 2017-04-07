import java.util.HashSet;
import java.util.Set;

/**
 * Created by ADDY on 07/04/17.
 */
public class Sets {

    public static <T> Set<T> union(Set<T> left, Set<T> right){

        if(left == null) return right;
        else if(right == null) return left;
        else{
            Set<T> unionSet = new HashSet<>(left.size()+right.size());
            unionSet.addAll(left);
            unionSet.addAll(right);
            return unionSet;
        }
    }

    public static <T> Set<T> intersection(Set<T> left, Set<T> right){

        Set<T> intersectionSet = new HashSet<>(Math.max(left.size(),right.size()));
        intersectionSet.addAll(left);
        intersectionSet.retainAll(right);
        return intersectionSet;
    }

    public static <T> Set<T> symmetricDiff(Set<T> left, Set<T> right){
        Set<T> symmDiff = union(left,right);
        symmDiff.removeAll(intersection(left,right));
        return symmDiff;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(5);
        HashSet<Integer> set2 = new HashSet<>(7);

        for(int i=1;i<=7;i++){
            set2.add(i);
            if(i<6) set1.add(i);
        }

        System.out.println(union(set1,set2));
        System.out.println(intersection(set1,set2));
        System.out.println(symmetricDiff(set1,set2));
    }
}
