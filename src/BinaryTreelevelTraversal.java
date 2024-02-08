import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreelevelTraversal {
    class Solution {
//        public List<List<Integer>> levelOrder(TreeNode root) {
//            List<List<Integer>> result = new ArrayList<>();
//            if(root == null){
//                return result;
//            }
//
//            Queue<TreeNode> queue = new LinkedList<>();
//            queue.add(root);
//            while(!queue.isEmpty()){
//                int size = queue.size();
//                List<Integer> currentList = new ArrayList<>();
//                for(int i=0; i<size; i++){
//                    TreeNode currentNode = queue.remove();
//                    currentList.add(currentNode.val);
//                    if(currentNode.left != null){
//                        queue.add(currentNode.left);
//                    }
//                    if(currentNode.right != null){
//                        queue.add(currentNode.right);
//                    }
//                }
//                result.add(currentList);
//            }
//            return result;
//        }
    }
    public static void main(String[] args) {

        Queue<TreeNode> queue = new LinkedList<>();
    }
}
