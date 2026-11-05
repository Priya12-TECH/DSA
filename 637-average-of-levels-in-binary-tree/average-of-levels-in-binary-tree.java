/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> avg = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return avg;
        }

        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();

            double sum = 0;

            for(int i = 0; i<size; i++){
                TreeNode curr = q.poll();
                sum = sum + curr.val;

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            avg.add(sum / size);
        }
        return avg;
    }
}