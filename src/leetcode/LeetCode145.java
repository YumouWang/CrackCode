package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();		
		postOrder(root, result);		
		return result;
    }
	
	public void postOrder (TreeNode node, List<Integer> nodeList) {  
		if (node == null) {
			return;
		}		
		postOrder(node.left, nodeList);
		postOrder(node.right, nodeList);
		nodeList.add(node.val);
	}

}
