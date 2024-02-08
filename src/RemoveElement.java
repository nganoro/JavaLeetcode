public class RemoveElement {
    public static int elementsRemoved(int[] elements, int val){
        int count = 0;

        for(int i=0; i<elements.length; i++){
            if(elements[i] == 2){
                continue;
            } else {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] elements = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(elementsRemoved(elements, val));
    }
}
