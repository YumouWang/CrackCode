package leetcode;

import java.util.Stack;

public class LeetCode101 {
	public boolean isSymmetric(TreeNode root) {
        if (root == null) {
        	return true;
        }
        if (root.left == null && root.right == null) {
        	return true;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.empty()) {
        	TreeNode node1 = stack.pop();
        	TreeNode node2 = stack.pop();
        	if (node1 == null && node2 == null) {
        		continue;
        	} else if (node1 == null || node2 == null) {
        		return false;
        	} else if (node1.val != node2.val) {
        		return false;
        	}
        	stack.push(node1.left);
        	stack.push(node2.right);
        	stack.push(node1.right);
        	stack.push(node2.left);
        }
        return true;
    }
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(3);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		LeetCode101 l = new LeetCode101();
		System.out.println(l.isSymmetric(node1));
		
	}
	
}
