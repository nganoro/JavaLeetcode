import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagramIII(String[] strs, List<List<String>> result){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String currentString: strs){
            char[] sortString = currentString.toCharArray();
            Arrays.sort(sortString);
            String sorted = new String(sortString);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(currentString);
        }
        result.addAll(map.values());
        return result;
    }
    public static List<List<String>> AnagramLists(List<String> anagram, List<List<String>> result){
        //"eat", "tea","tan","ate","nat","bat"
        int index = 0;
        HashSet<String> set = new HashSet<>();
        for(String currentStr: anagram){
            if(!set.contains(currentStr)) {
                List<String> currentList = new ArrayList<>();
                for (int i = 0; i < anagram.size(); i++) {
                    if (!set.contains(anagram.get(i))) {
                        if (checkAnagram(currentStr, anagram.get(i))) {
                            currentList.add(anagram.get(i));
                            set.add(anagram.get(i));
                        }
                    }
                }
                if(!currentList.isEmpty()){
                    result.add(currentList);
                }
            }
        }

        return result;
    }

    public static boolean checkAnagram(String a, String b){
        boolean finalResult = true;

        if(a.length() != b.length()){
            finalResult = false;
        }
        HashMap<Character, Integer> aMap = new HashMap<>();
        for(char firstChars: a.toCharArray()){
            aMap.put(firstChars, aMap.getOrDefault(firstChars, 0)+ 1);
        }

        HashMap<Character, Integer> bMap = new HashMap<>();
        for(char secondChar: b.toCharArray()){
            bMap.put(secondChar, bMap.getOrDefault(secondChar, 0)+ 1);
        }


        for(char currentChar: aMap.keySet()){
            if(!bMap.containsKey(currentChar) || aMap.get(currentChar) != bMap.get(currentChar)){
                finalResult = false;
            }
        }

        return finalResult;
    }

    public static List<List<String>> groupAnagramII(List<String> anagram, List<List<String>> result){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String current: anagram){
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {
        List<String> anagrams = Arrays.asList("eat", "tea","tan","ate","nat","bat");
        List<List<String>> result = new ArrayList<>();
//        System.out.println(AnagramLists(anagrams, result));
        //System.out.println(groupAnagramII(anagrams, result));
        String[] anagramsArray = {"eat", "tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramIII(anagramsArray, result));

    }
}
