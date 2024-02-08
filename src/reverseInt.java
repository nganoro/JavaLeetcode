public class reverseInt {

    public static int binaryReverse(int num){

        int rev = 0;
        while( num != 0){
            int m = num % 10;
            num = num/10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev =  (rev *10) + m;
        }

        return rev;
    }




    public static void main(String[] args) {
        int num = 123;
        System.out.println(binaryReverse(num));
    }
}
