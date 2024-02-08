import java.util.ArrayList;
import java.util.List;

public class letterComboOfPhone {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String digits = "23";

        String[] mapping = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        letterCombinationsRecursive(result, digits, "", 0, mapping);

        System.out.println(result);
    }

    public static void letterCombinationsRecursive(List<String> result, String digits, String current, int index, String[] mapping){
        //by the time it starts the equivalent of a nested loop by going thru 'def', index is same size as digits
        //which lets t store into result at the right time
        if(index == digits.length()){
            result.add(current);
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for(int i=0; i<letters.length(); i++){
            letterCombinationsRecursive(result, digits, current + letters.charAt(i), index + 1, mapping);
        }

    }
}
