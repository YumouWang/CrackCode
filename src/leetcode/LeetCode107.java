package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<TreeNode>> result = new ArrayList<List<TreeNode>>();
		List<TreeNode> rootList = new ArrayList<TreeNode>();

		List<List<Integer>> output = new ArrayList<List<Integer>>();
		List<Integer> rootValue = new ArrayList<Integer>();
		if (root == null) {
			return output;
		}

		rootList.add(root);
		result.add(rootList);
		
		int level = 0;
		while (true) {
			List<TreeNode> currentResult = new ArrayList<TreeNode>();
			for (int i = 0; i < result.get(level).size(); i++) {
				TreeNode treeNode = result.get(level).get(i);
				if (treeNode.left != null) {
					currentResult.add(treeNode.left);
				}
				if (treeNode.right != null) {
					currentResult.add(treeNode.right);
				}
			}
			if (currentResult.size() > 0) {
				level++;
				result.add(level, currentResult);
			} else {
				break;
			}
		}

		level = 0;
		rootValue.add(root.val);
		output.add(rootValue);
		System.out.println(level + "," + output);
		level++;
		while (level < result.size()) {
			List<Integer> currentList = new ArrayList<Integer>();
			for (int i = 0; i < result.get(level).size(); i++) {
				TreeNode treeNode = result.get(level).get(i);
				currentList.add(treeNode.val);
			}
			if (currentList.size() > 0) {
				output.add(0, currentList);
				level++;
			} else {
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;
		LeetCode107 l = new LeetCode107();
		System.out.println(l.levelOrderBottom(node1));
	}
}
