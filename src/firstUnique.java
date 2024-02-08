import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class firstUnique {
    public static int uniqueChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        for(char a: str.toCharArray()){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(char b: str.toCharArray()){
            if(map.get(b) == 1){
                result = str.indexOf(b);
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String word = "loveleetcode";
        System.out.println(uniqueChar(word));
    }
}
