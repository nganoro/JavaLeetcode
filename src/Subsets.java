import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> findSubsets(int[] subset) {
        // [], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]
        List<List<Integer>> result = new ArrayList<>();
                findSubsets(0, subset, new ArrayList<Integer>(), result);
//        result.add(new ArrayList<Integer>());

        return result;
    }

    public static void findSubsets(int index, int[] subsets, List<Integer> tempResult, List<List<Integer>> result){
        //you want to add a copy of current because you're going to modify it
//        result.add(tempResult);
        result.add(new ArrayList<>(tempResult));

        for(int i=index; i<subsets.length; i++){
            tempResult.add(subsets[i]);
            findSubsets(i + 1, subsets, tempResult, result);
            //it ends up at i = 1 & index = 1 after it exits the 1st stack bcuz it succeeded
            //so it will go thru the first round of recursive, add 1,2 & 3, and then go back to i=1
            //you can verify this by seeing how the recursive call that added tempResult is removed when exiting the stack
            //1st calls adds 2, 2nd call adds 3, and you knwo both exitied cuz both removed themselves
            tempResult.remove(tempResult.size()-1);
        }
    }
    public static List<List<Integer>> findSubsetsII(int[] subset){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());

        for(int x: subset){
            int n = result.size();
            for(int i=0; i<n; i++){
                //importance of assigning it result.get(i) is so it can assing the last thing
                //example: it can assign 1 so it can add the 2 and you can get [1,2]
                List<Integer> tempResult = new ArrayList<>(result.get(i));
                tempResult.add(x);
                result.add(tempResult);
            }
        }

        return result;
    }



    public static void main(String[] args) {
        int[] subset = {1,2,3};

//        System.out.println(findSubsets(subset));
        System.out.println(findSubsetsII(subset));

    }
}
