/**
 * Created by ADDY on 09/01/17.
 * src: https://www.hackerrank.com/challenges/ctci-making-anagrams
 *
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;
class MakingAnagrams {
    static Map<Character, Integer> getMap(char[] charArray){
        Integer count;
        Map<Character, Integer> map = new HashMap<>();
        for (Character i : charArray) {
            count = map.get(i);
//            System.out.println(map.get(i));
            map.put(i, count != null ? count+1 : 1);
        }

        return map;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[] first = in.nextLine().toCharArray();
        char[] second = in.nextLine().toCharArray();

        Map<Character, Integer> fMap = getMap(first);
        Map<Character, Integer> sMap = getMap(second);

        System.out.println(fMap);
        System.out.println(sMap);
        System.out.println(fMap.equals(sMap));
    }
}
