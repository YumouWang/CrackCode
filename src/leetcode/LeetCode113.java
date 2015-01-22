package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum){
	    List<List<Integer>> result  = new LinkedList<List<Integer>>();
	    List<Integer> currentResult  = new LinkedList<Integer>();
	    pathSum(root,sum,currentResult,result);
	    return result;
	}

	public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
	        List<List<Integer>> result) {
		System.out.println("`````");
	    if (root == null)
	        return;
	    currentResult.add(new Integer(root.val));
	    if (root.left == null && root.right == null && sum == root.val) {
	        result.add(new LinkedList<Integer>(currentResult));
	        System.out.println(currentResult);
	        currentResult.remove(currentResult.size() - 1);
	        return;
	    } else {
	        pathSum(root.left, sum - root.val, currentResult, result);
	        pathSum(root.right, sum - root.val, currentResult, result);
	    }
	    System.out.println(currentResult + "--");
	    currentResult.remove(currentResult.size() - 1);
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(8);
		TreeNode node4 = new TreeNode(11);
		TreeNode node5 = new TreeNode(13);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(2);
		TreeNode node9 = new TreeNode(5);
		TreeNode node10 = new TreeNode(1);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		node4.left = node7;
		node4.right = node8;
		node6.left = node9;
		node6.right = node10;
		
		LeetCode113 l = new LeetCode113();
		List<List<Integer>> result = l.pathSum(node1, 22);
		System.out.println(result);
	}
}
