package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<TreeNode>> result = new ArrayList<List<TreeNode>>();
		List<TreeNode> rootList = new ArrayList<TreeNode>();

		List<List<Integer>> output = new ArrayList<List<Integer>>();
		List<Integer> rootValue = new ArrayList<Integer>();
		if (root == null) {
			return output;
		}

		rootList.add(root);
		result.add(rootList);
		rootValue.add(root.val);
		output.add(rootValue);
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
		while (true) {
			List<Integer> currentList = new ArrayList<Integer>();
			if (level % 2 == 0 || level == 0) {
				for (int i = result.get(level).size() - 1; i >= 0; i--) {
					TreeNode treeNode = result.get(level).get(i);
					if (treeNode.right != null) {
						currentList.add(treeNode.right.val);
					}
					if (treeNode.left != null) {
						currentList.add(treeNode.left.val);
					}
				}
			} else {
				for (int i = 0; i < result.get(level).size(); i++) {
					TreeNode treeNode = result.get(level).get(i);
					if (treeNode.left != null) {
						currentList.add(treeNode.left.val);
					}
					if (treeNode.right != null) {
						currentList.add(treeNode.right.val);
					}
				}
			}

			if (currentList.size() > 0) {
				level++;
				output.add(level, currentList);
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
		LeetCode103 l = new LeetCode103();
		System.out.println(l.zigzagLevelOrder(node1));
	}
}
