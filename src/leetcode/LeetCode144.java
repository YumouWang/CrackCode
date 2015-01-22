package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        if (root == null) {
        	return result;
        }
        else {
        	result = preorderTraversal(root.right);
        	temp = preorderTraversal(root.left);
        	for (int i = temp.size() - 1; i > -1; i --) {
        		result.add(0, temp.get(i));
        	}
        	result.add(0, root.val);
        }
        return result;
    }
	
	public void preOrder (TreeNode node, List<Integer> nodeList) {  
		if (node == null) {
			return;
		}
		nodeList.add(node.val);
		preOrder(node.left, nodeList);
		preOrder(node.right, nodeList);
	}
	
	public void inOrder (TreeNode node) {  
		
	}

	public void postOrder (TreeNode node) {  
	
	}
	
	
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		
		node1.left = node2;
		node1.right = node5;
		node2.left = node3;
		node2.right = node4;
		node5.left = node6;
		node6.left = node7;
		
		LeetCode144 l = new LeetCode144();
		List<Integer> result = l.preorderTraversal(node1);
		System.out.println(result);
	}

}
