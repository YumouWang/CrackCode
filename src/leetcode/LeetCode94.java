package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();		
		inOrder(root, result);		
		return result;
    }
	
	public void inOrder (TreeNode node, List<Integer> nodeList) {  
		if (node == null) {
			return;
		}		
		inOrder(node.left, nodeList);
		nodeList.add(node.val);
		inOrder(node.right, nodeList);
	}

}
