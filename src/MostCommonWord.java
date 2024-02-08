import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned){
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(String bannedWords: banned){
            set.add(bannedWords);
        }
        String result = "";
        int max = Integer.MIN_VALUE;
        for(String str: paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")){
            map.put(str, map.getOrDefault(str,  0) + 1);
        }
        for(String a: map.keySet()){
            if(!set.contains(a) && map.get(a) > max){
                max = map.get(a);
                result = a;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
