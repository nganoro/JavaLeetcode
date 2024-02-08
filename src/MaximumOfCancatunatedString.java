import org.w3c.dom.ls.LSOutput;

import java.net.Inet4Address;
import java.util.*;

public class MaximumOfCancatunatedString {

    public static int uniqueCharCount(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character chr: str.toCharArray()){
            map.put(chr, map.getOrDefault(chr, 0) + 1);
            if(map.get(chr) > 1){
                return -1;
            }
        }

        return str.length();
    }
    public static void maximumConcatunate(int[] result, int index, String current, List<String> str){
        //"un","iq","ue"
        if(index == str.size() && uniqueCharCount(current) > result[0]){
            result[0] = current.length();
            return;
        }
        if(index == str.size()){
            return;
        }

        /** this first recurrsive call will have call stacks of "un", "uniq", "unique"
         * and when done, it has to get out of all 3 call stacks it built, and then it will move on to the second
         * call stack as the original empty string
         */
        maximumConcatunate(result, index + 1, current + str.get(index), str);
        /**the bottom recursive essentially takes what failed in the recursion above and goes back a step, which was
        //working which is why it came this far. So it basically takes the last thing that worked and uses it;
         By not sending a new string to current but increasing index, it adds as a safety net**/
        maximumConcatunate(result, index + 1, current, str);
    }

//    public static void maximumConcatunateII(int[] result, int index, String current, List<String> str){
//        if(uniqueCharCount(current) > 0 && index == str.size()){
//            result[0] = current.length();
//        }
//        if(index == str.size()){
//            return;
//        }
//
//        for(int i=; i<str.size(); i++) {
//            maximumConcatunateII(result, index + 1, current + str.get(i), str);
//        }
////        maximumConcatunateII(result, index, current + str.get(index), str);
//
//    }
    public static void main(String[] args) {
        List<String> str = Arrays.asList("un","iq","ue");
        List<String> testCaseII = Arrays.asList("cha","r","act","ers");
        int[] result = new int[1];
        maximumConcatunate(result, 0, "", str);
//        maximumConcatunateII(result, 0, "", testCaseII);


        System.out.println(result[0]);
    }
}
