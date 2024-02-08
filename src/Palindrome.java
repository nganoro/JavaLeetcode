public class Palindrome {
    public static boolean reverse(String str) {
        boolean result = true;
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            char temp = str.charAt(i);
            char temp2 = str.charAt(j);
            if (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            } else if (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } else if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return result;
    }


    public static boolean reverseTestII(String str){
        char[] stringToCh = str.toCharArray();
        int i=0;
        int j=str.length()-1;

        while(i<j){
            while(i<j && !Character.isLetterOrDigit(stringToCh[i])){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(stringToCh[j])){
                j--;
            }
            if(Character.toLowerCase(stringToCh[i]) != Character.toLowerCase(stringToCh[j])){
                return false;
            }
            char temp = Character.toLowerCase(stringToCh[i]);
            stringToCh[i++] = Character.toLowerCase(stringToCh[j]);
            stringToCh[j--] = temp;
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
//        System.out.println(reverse(test));
        System.out.println(reverseTestII(test));
    }
}
