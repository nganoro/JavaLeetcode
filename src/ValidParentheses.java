public class ValidParentheses {
    public static void main(String[] args) {
        String str = "(]";
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == '(' && str.charAt(i+1) != ')'){
                System.out.println("false");;
            }if(str.charAt(i) == '{' && str.charAt(i+1) != '}'){
                System.out.println("false");;
            } if(str.charAt(i) == '[' && str.charAt(i+1) != ']'){
                System.out.println("false");;
            }
        }
        System.out.println("true");;
    }
}
