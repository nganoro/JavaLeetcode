import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static int[] sum(int[] nums, int tar){
        int[] result = new int[2];
        //key = index, Value = index number
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int temp = tar - nums[i];
            if(map.containsKey(temp)){
                result[0] = map.get(temp);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        for(int result: sum(nums, target)){
            System.out.println(result);
        }
    }
}
