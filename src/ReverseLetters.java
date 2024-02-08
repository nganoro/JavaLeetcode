public class ReverseLetters {
    public static char[] reverse(String word){
        String result = "";
        int i=0;
        int j=word.length()-1;
        char[] characters = word.toCharArray();

        while(i<j){
            while(i<j && (!Character.isLetter(word.charAt(i)))){
                i++;
            }
            while(i<j && (!Character.isLetter(word.charAt(j)))){
                j--;
            }
            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }

        return characters;
    }

    public static void main(String[] args) {
        String str = "ab-cd";
        System.out.println(reverse(str));
    }
}
