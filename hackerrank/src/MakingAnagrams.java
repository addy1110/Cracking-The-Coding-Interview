/**
 * Created by ADDY on 09/01/17.
 * src: https://www.hackerrank.com/challenges/ctci-making-anagrams
 *
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class MakingAnagrams {
    static Set<Character> getSet(String str){
        Set<Character> S1 = new HashSet<>();
        for(char c: str.toCharArray()){
            S1.add(c);
        }
        return S1;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();

        Set<Character> f = getSet(first);
        Set<Character> s = getSet(second);

        Set<Character> inter = new HashSet<>();

        System.out.println(f.retainAll(s));
        System.out.println(f);
    }
}
