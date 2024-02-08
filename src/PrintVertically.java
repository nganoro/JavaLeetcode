import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintVertically {
    public static List<String> verticalStrings(String str){
        List<String> result = new ArrayList<>();
        int largestString = 0;
        ArrayList<String> tempString = new ArrayList<>();
        for(String currentString: str.split(" ")){
            tempString.add(currentString);
            largestString = Math.max(largestString, currentString.length());
        }

        int count = 0;
        while(count < largestString){
            String tempStr = "";
            for(int i=0; i<tempString.size(); i++){
                String currentString = "";
                if(largestString > tempString.get(i).length() && count == largestString - 1){
                    currentString = tempString.get(i) + ' ';
                    tempStr += currentString.charAt(count);
                } else {
                    tempStr += tempString.get(i).charAt(count);
                }
            }
            String tempStr2 = tempStr.replaceAll("\\s+$", "");
            result.add(tempStr2);
            count++;
        }
        return result;
    }

    public static String[] result(String str){
        String[] result;
        int maxLength = Integer.MIN_VALUE;
        String[] strLength = str.split( " ");
        for(String s: strLength){
            if(s.length() > maxLength){
                maxLength = s.length();
            }
        }

        result = new String[maxLength];
        int currentIndex = 0;
        String currentString = "";

        while(currentIndex < maxLength){
            for(int i=0; i<strLength.length; i++){
                if((currentIndex == maxLength - 1) && strLength[i].length() < maxLength){
                    strLength[i] = strLength[i] + ' ';
                    currentString += strLength[i].charAt(currentIndex);
                } else {
                    currentString += strLength[i].charAt(currentIndex);
                }
            }
            result[currentIndex] = currentString;
            currentIndex++;
            currentString = "";
        }


        return result;
    }
    public static void main(String[] args) {
        String str = "TO BE OR NOT TO BE";
//        System.out.println(verticalStrings(str));
        for(String a: result(str)){
            System.out.println(a);
        }
    }
}
