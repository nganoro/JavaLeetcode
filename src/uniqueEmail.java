import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.text.Collator;
import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class uniqueEmail {
    public static void uniqueEmails(String[] emails){
        HashSet<String> emailSet = new HashSet<>();
        String local = "";
        String domain;
        for(String a:emails){
            String[] words=a.split("@");//splits the string based on whitespace
            local = words[0];
            domain = words[1];
            String[] editedWords=local.split("\\+");//splits the string based on whitespace
            String editedLocal = "";
            for(char b: editedWords[0].toCharArray()){
                if(Character.isLetter(b)){
                    editedLocal += b;
                }
            }
            emailSet.add(editedLocal + '@' + domain);
        }
        for(String email: emailSet){
            System.out.println(email);
        }
    }

    public static String longestPrefix(String[] words){
        //"flower","flow","flight"
        String result = "";
        int count = 0;
        for(char firstWord: words[0].toCharArray()) {
            for (int i=1; i<words.length; i++) {
                char currentChar = words[i].toCharArray()[count];
                if (firstWord != currentChar && count >= words[i].length()) {
                    return result;
                }
            }
            count++;
        }
        return result;
    }

    public static boolean validPalindromeII(String word){
        int i=0;
        int j=word.length()-1;
        while(i<j){
            if(word.charAt(i) != word.charAt(j)){
                return isPalindrome(word, i+1, j) || isPalindrome(word, i, j-1);
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome(String word, int i, int j){
        while(i<j){
            char a = word.charAt(i);
            char b = word.charAt(j);
            if(word.charAt(i++) != word.charAt(j--)){
                return false;
            }
        }

        return true;
    }

    public static boolean backSpace(String t, String s){
        //ab#c
        HashSet<String> set = new HashSet<>();
        Stack<Character> tStack = new Stack<>();
        String result = "";
        for(char a: t.toCharArray()){
            if(a != '#'){
                tStack.add(a);
            } else if(!tStack.empty()){
                tStack.pop();
            }
        }
        for(char a: tStack){
            result += a;
            set.add(result);
        }

        Stack<Character> sStack = new Stack<>();
        result = "";
        for(char a: s.toCharArray()){
            if(a != '#'){
                sStack.add(a);
            } else if(!sStack.isEmpty()){
                sStack.pop();
            }
        }
        while(!sStack.isEmpty()){
            char current = sStack.pop();
            if(tStack.isEmpty() || tStack.pop() != current){
                return false;
            }
        }

        return true;

    }

    public static int firstUniqueCharacter(String word){
        int result;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char a: word.toCharArray()){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(int i=0; i<word.length(); i++){
            int a = map.get(word.charAt(i));
            if(a == 1){
                return result = i;
            };
        }

        return 0;
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
            int diff = target - nums[i];
            if(map.size() > 1 && map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
            }
        }

        return result;
    }

    public static String addStrings(String str1, String str2){
        String result = "";
        int strring1 = Integer.parseInt(str1);
        int strring2 = Integer.parseInt(str2);

        int finalString = strring1 + strring2;
        return result = Integer.toString(finalString);
    }

    public static String sortChar(String str){
        StringBuilder result = new StringBuilder();
        //tree
        //012
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> wordQue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        wordQue.addAll(map.keySet());
        System.out.println(wordQue);
        while(!wordQue.isEmpty()){
            char current = wordQue.remove();
            for(int i=0; i<map.get(current); i++){
                result.append(current);
            }
        }

        return result.toString();
    }

    public static int[][] closetToOrigion(int[][] arr, int target){
        int[][] result = new int[target][2];

        //queue in ascending order
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> closestPoint(a) - closestPoint(b));
        for(int[] array: arr){
            maxHeap.add(array);
            if(maxHeap.size() > target){
                maxHeap.remove();
            }
        }
        int count = 0;
        while(!maxHeap.isEmpty()){
            result[count++] = maxHeap.remove();
        }

        return result;
    }

    public static int closestPoint(int[] arr){
        //2, -2
        double result;
        result = (Math.pow(arr[0], 2)) + (Math.pow(arr[1], 2));
        return (int) Math.pow(result, 2);
    }

    public static int largestNum(int[] num){
//        int[] finalResult = new int[num.length];
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        String res = "";
        int result = 0;
//
//        for(int i=0; i<num.length; i++){
//            res += String.valueOf(num[i]);
//            result = Integer.parseInt(res);
//        }
//        res = "";
//        arrayList.add(result);
//
//        for(int i=num.length-1; i>=0; i--) {
//            res += String.valueOf(num[i]);
//            result = Integer.parseInt(res);
//        }
//        arrayList.add(result);
//        int count = 0;
//        for(int a: arrayList){
//            finalResult[count++] = a;
//        }
//        Arrays.sort(finalResult);
//
//        return finalResult[finalResult.length - 1];


        /** wrong code, check its own class **/
        return result;
    }

    public static int maximumSubArray(int[] arr){
        //-2,1,-3,4,-1,2,1,-5,4
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int num: arr){
            //sum does the calculation of diff indexes and goes to maxSum, which saves the biggest sum
            sum = Math.max(sum, 0) + num;
            //maxSum basically filters and helps us find the best starting point, which would be a bigger number
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        IntStream stream;
        String[] email = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        String[] words = {"flower","flow","flight"};
        String word = "abca";
        String backspaceI = "ab#c";
        String backspaceII = "ad#c";
        String firstUniqueChar = "leetcode";
        int[] nums = {2,7,11,15};
        int target = 9;
        String num1 = "456";
        String num2 = "77";
        String str = "Aabb";
        int[][] arr1 = {{3, 3}, {5, -1}, {-2, 4}};
        int target2 = 2;
        int[] num = {3,30,34,5,9};
        int[] subArray = {-2,1,-3,4,-1,2,1,-5,4};
//        uniqueEmails(email);
//        System.out.println(longestPrefix(words));
//        System.out.println(validPalindromeII(word));
//        System.out.println(backSpace(backspaceI, backspaceII));
//        System.out.println(firstUniqueCharacter(firstUniqueChar));
//        for(int result: twoSum(nums, target)){
//            System.out.println(result);
//        }
//        System.out.println(addStrings(num1, num2));
//        System.out.println(sortChar(str));
//        for(int[] result: closetToOrigion(arr1, target2)){
//            for(int finalResult: result){
//                System.out.print(finalResult);
//            }
//            System.out.println();
//        }
        System.out.println(largestNum(num));
//        System.out.println(maximumSubArray(subArray));
    }

}
