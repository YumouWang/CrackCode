package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode112 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		List<List<Integer>> pathList = getPath(root);
		for (List<Integer> list : pathList) {
			int pathSum = 0;
			for (Integer integer : list) {
				pathSum += integer;
			}
			if (pathSum == sum) {
				return true;
			}
		}
        return false;
    }
	
	public List<List<Integer>> getPath(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentResult = new ArrayList<Integer>();
		if (root == null) {
			return null;
		} else if (root.left == null && root.right == null) {
			currentResult.add(root.val);
			result.add(currentResult);
		} else {
			List<List<Integer>> temp1 = getPath(root.right);
			if (temp1 != null) {
				for (List<Integer> list : temp1) {
					list.add(0, root.val);
					result.add(list);
				}
			}
			List<List<Integer>> temp2 = getPath(root.left);
			if (temp2 != null) {
				for (List<Integer> list : temp2) {
					list.add(0, root.val);
					result.add(list);
				}
			}
		}
		return result;
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
		TreeNode node9 = new TreeNode(1);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		node4.left = node7;
		node4.right = node8;
		node6.right = node9;
		
		LeetCode112 l = new LeetCode112();
		System.out.println(l.hasPathSum(node1, 22));
		System.out.println(l.getPath(node1));
	}

}
