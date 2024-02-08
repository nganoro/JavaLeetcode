import java.util.HashSet;
import java.util.Stack;

public class Backspace {

    public static String setCheck(String word){
        //ab#c    ad#c
      String result = "";
      Stack<Character> stack = new Stack<>();

      for(char a: word.toCharArray()){
        if(a != '#'){
          stack.add(a);
        } else if(!stack.empty()){
          stack.pop();
        }
      }

      return stack.toString();
    }

    public static boolean backspace(String[] words){
        Boolean result = false;
        HashSet<String> set = new HashSet<>();

        for(String word: words){
            set.add(setCheck(word));
        }

        if(set.size() == 1){
            return true;
        }

        return result;
    }

    public static void main(String[] args){
        String[] str = {"ab##", "d#c#"};
        System.out.println(backspace(str));

    }
}
