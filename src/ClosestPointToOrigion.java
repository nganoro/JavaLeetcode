import java.util.PriorityQueue;

public class ClosestPointToOrigion {
    public static int[][] closest(int[][] arr, int target){
        //the target is how many, the 2 is how many within each array
        int[][] result = new int[target][2];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> closestPoint(a) - closestPoint(b));
        for(int[] currentArray: arr){
            maxHeap.add(currentArray);
        }

        int count = 0;
        while(!maxHeap.isEmpty() && count < target){
            result[count++] = maxHeap.remove();
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int target = 2;

        for(int[] finalResult: (closest(points, target))){
            for(int a: finalResult){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static int closestPoint(int[] arr){
        //2, -2
        double result;
        result = (Math.pow(arr[0], 2)) + (Math.pow(arr[1], 2));
        return (int) Math.pow(result, 2);

    }
}
