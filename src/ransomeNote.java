import java.sql.SQLOutput;
import java.util.HashMap;

public class ransomeNote {
    public static boolean findRansom(String ransom, String mag){
        HashMap<Character, Integer> magazineMap = new HashMap<>();
//        for(char a: ransom.toCharArray()){
//            ransomeMap.put(a, ransomeMap.getOrDefault(a, 0) + 1);
//        }
        char ransomChar = ransom.charAt(0);

        for(char b: mag.toCharArray()){
            magazineMap.put(b, magazineMap.getOrDefault(b, 0) + 1);
        }

        for(int i=0; i<magazineMap.size(); i++){
            if(magazineMap.containsKey(ransomChar) && magazineMap.get(ransomChar) >= ransom.length()){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(findRansom(ransomNote, magazine));
    }
}
