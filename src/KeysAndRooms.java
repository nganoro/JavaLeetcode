import java.util.*;

public class KeysAndRooms {

    public static boolean keyII(List<List<Integer>> rooms) {
        if(rooms == null){
            return false;
        };

        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);

        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        while(!stack.empty()){
            int currentRoom = stack.pop();
            int size = rooms.get(currentRoom).size();
            for(int i=0; i<size; i++) {
                if (!visited.contains(rooms.get(currentRoom).get(i))) {
                    stack.add(rooms.get(currentRoom).get(i));
                    visited.add(rooms.get(currentRoom).get(i));
                }
            }
        }

        return visited.size() == rooms.size();
    }
    public static boolean key(List<List<Integer>> rooms) {
        if(rooms == null){
            return false;
        }
        //represents visited rooms
        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);

        //represents keys that allow you access to these rooms which you throw away or pop once you visit them
        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        while(!stack.isEmpty()){
            List<Integer> visitedRooms = rooms.get(stack.pop());

            for(int keys: visitedRooms){
                if(!visited.contains(keys)){
                    stack.add(keys);
                    visited.add(keys);
                }
            }
        }

        //rooms visited should equal rooms available, which tells you if you had access to all of it or not
        return visited.size() == rooms.size();

    }
    public static void main(String[] args) {
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1,3),
                Arrays.asList(3,0,1),
                Arrays.asList(2),
                Arrays.asList(0));
//                Arrays.asList(1),
//                Arrays.asList(2),
//                Arrays.asList(3),
//                Arrays.asList());
//        System.out.println(key(rooms));
        System.out.println(keyII(rooms));
    }
}
