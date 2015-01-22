package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144second {
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();		
		preOrder(root, result);		
		return result;
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();		
		inOrder(root, result);		
		return result;
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();		
		postOrder(root, result);		
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
	
	public void inOrder (TreeNode node, List<Integer> nodeList) {  
		if (node == null) {
			return;
		}		
		inOrder(node.left, nodeList);
		nodeList.add(node.val);
		inOrder(node.right, nodeList);
	}

	public void postOrder (TreeNode node, List<Integer> nodeList) {  
		if (node == null) {
			return;
		}		
		postOrder(node.left, nodeList);
		postOrder(node.right, nodeList);
		nodeList.add(node.val);
	}
	
	
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		node1.left = node2;
		node1.right = node5;
		node2.left = node3;
		node2.right = node4;
		node5.left = node6;
		node5.right = node7;
		
		LeetCode144second l = new LeetCode144second();
		List<Integer> result = l.preorderTraversal(node1);
		System.out.println(result);
		
		List<Integer> result1 = l.inorderTraversal(node1);
		System.out.println(result1);
		
		List<Integer> result2 = l.postorderTraversal(node1);
		System.out.println(result2);
	}


}
