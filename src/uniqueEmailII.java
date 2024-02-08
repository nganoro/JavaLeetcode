import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class uniqueEmailII {

    public static HashSet<String> cleanUpEmail(String[] email){
        HashSet<String> result = new HashSet<>();
        for(int i=0; i<email.length; i++){
            String tempString = "";
            String[] domain = email[i].split("@");
            for(char a: email[i].toCharArray()){
                if(a == '.'){
                    continue;
                } else if( a == '+') {
                    break;
                } else {
                    tempString += (a);
                }
            }

            result.add(tempString + '@' + domain[1]);
        }

        return result;
    }

    public static void main(String[] args) {
        //my@email.com
        String[] test = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        System.out.println(cleanUpEmail(test));

    }
}
