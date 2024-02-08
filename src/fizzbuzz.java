import java.util.ArrayList;
import java.util.ResourceBundle;

public class fizzbuzz {

    public static String[] fizzBuzz(int a){
        int num = 0;
        String[] result = new String[a];
        for(int i=1; i<=a; i++){
            if ((i % 3 == 0 ) && ((i % 5) == 0)){
                result[num] = "FizzBuzz";
            } else if (i % 5 == 0){
                result[num] = "Buzz";
            } else if (i % 3 == 0){
                result[num] = "Fizz";
            } else {
                result[num] = Integer.toString(i);
            }
            num++;
        }

        return result;
    }

    public static String[] fizzBuzzII(int num){
        String[] result = new String[num];
        int count = 0;

        for(int i=1; i<=num; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                result[count] = "FizzBuzz";
            } else if (i % 3 == 0){
                result[count] = "Buzz";
            } else if (i % 5 == 0){
                result[count] = "Fizz";
            } else {
                result[count] = String.valueOf(i);
            }
            count++;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 15;
//        for(String a: fizzBuzz(num)){
//            System.out.println(a);
//        }

        for(String a: fizzBuzzII(num)){
            System.out.println(a);
        }
    }
}
