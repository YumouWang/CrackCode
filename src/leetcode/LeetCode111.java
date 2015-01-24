package leetcode;

public class LeetCode111 {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
 			return 1;
 		} else if (root.left != null && root.right == null) {
 			return minDepth(root.left) + 1;
 		} else if (root.left == null && root.right != null) {
 			return minDepth(root.right) + 1;
 		} else {
 			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
 		}
    }
	
	public static void main (String[] args) {
		TreeNode root = new TreeNode(0);
		LeetCode111 l = new LeetCode111();
		System.out.println(l.minDepth(root));
	}
	
	

}
