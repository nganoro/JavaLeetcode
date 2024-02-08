import java.util.Arrays;

public class LargestNum {
    public static String findLargest(int[] nums){
        String result = "";
        int n= nums.length;
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = String.valueOf(nums[i]);
        }
        //very basic logic. literally only compares which number would be bigger when digits combined
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        result = s.toString();
        return result;
    }
    public static void main(String[] args) {
        int[] num = {3,30,34,5,9};
        System.out.println(findLargest(num));
    }
}
