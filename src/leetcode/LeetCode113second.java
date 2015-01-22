package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113second {
	public List<List<Integer>> pathSum(TreeNode root, int sum){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		List<List<Integer>> temp = levelOrder(root);
		for (List<Integer> list : temp) {
			int sumNumber = 0;
			for (Integer integer : list) {
				sumNumber += integer;
			}
			System.out.println();
			if (sumNumber == sum) {
				result.add(list);
			}
		}
		return result;
	}	
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> currentResult = new ArrayList<Integer>();
        if (root == null) {        	
        	return result;
        }
        if (root.left == null && root.right == null) {
        	currentResult.add(root.val);
        	result.add(currentResult);
        	return result;
        } else {
        	List<Integer> temp1 = null;
        	List<Integer> temp2 = null;
        	for (List<Integer> list : levelOrder(root.left)) {
        		temp1 = list;
        		temp1.add(0, root.val);
        		result.add(temp1);
        	}
        	for (List<Integer> list : levelOrder(root.right)) {
        		temp2 = list;
        		temp2.add(0, root.val);
        		result.add(temp2);
        	}
        	return result;
        }       
    }
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(-2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);
		
		node1.left = node2;
		node1.right = node3;
		//node3.left = node4;
		//node3.right = node5;
		LeetCode113second l = new LeetCode113second();
		System.out.println(l.levelOrder(node1));
		System.out.println(l.pathSum(node1, 3));
	}
}
