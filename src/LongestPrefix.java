public class LongestPrefix {

    public static String prexif(String[] word){
        String result = "";
        char[] firstPrefix = word[0].toCharArray();
        int count = 0;
        for(int j=0; j<firstPrefix.length; j++){
            for(int i=1; i<word.length; i++){
                if(firstPrefix[count] != word[i].charAt(count)){
                    return result;
                }
            }
            result += firstPrefix[count++];
        }

        return result;
    }

    public static String prefix(String[] str){
        String result = "";

        String firstStr = str[0];
        int index = 0;

        for(char ch: firstStr.toCharArray()){
            for(int i=1; i<str.length; i++){
                if(index > str[i].length() || ch != str[i].charAt(index)) {
                    return result;
                }
            }
            result += ch;
            index++;
        }

        return result;
    }

    public static void main(String[] args){
        String[] str = {"flower","flow","flight"};
//        System.out.println(prexif(str));
        System.out.println(prefix(str));
    }
}
