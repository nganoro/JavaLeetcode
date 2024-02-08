import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacter {
    public static String sort(String str){
        String result = "";
        HashMap<Character, Integer> map = new HashMap<>();
        //descending
        PriorityQueue<Character> minHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(char a: str.toCharArray()){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(char word: str.toCharArray()){
            minHeap.add(word);
        }

        while(!minHeap.isEmpty()){
            result += minHeap.remove();
        }

        return result;
    }
    public static void main(String[] args) {
        String str = "Aabb";
        System.out.println(sort(str));
    }
}
