package leetcode;

import java.util.Stack;

public class LeetCode114 {
	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
        	TreeNode currentNode = stack.pop();
        	if (currentNode.right != null) {
        		stack.push(currentNode.right);
        	}
        	if (currentNode.left != null) {
        		stack.push(currentNode.left);
        	}
        	if (!stack.isEmpty()) {
        		currentNode.right = stack.peek();
        	}
        	currentNode.left = null;
        }
    }
	
	public static void main(String[] args) {
		
	}

}
