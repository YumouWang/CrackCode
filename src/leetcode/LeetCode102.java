package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode102 {

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<List<Integer>>();
		}
		List<List<TreeNode>> result = new ArrayList<List<TreeNode>>();
		List<TreeNode> list = new ArrayList<TreeNode>();
		list.add(root);
		result.add(0, list);
		int level = 0;
		while (true) {
			List<TreeNode> currentList = new ArrayList<TreeNode>();
			for (int i = 0; i < result.get(level).size(); i++) {
				TreeNode node = result.get(level).get(i);
				if (node != null) {
					if (node.left != null) {
						currentList.add(node.left);
					}
					if (node.right != null) {
						currentList.add(node.right);
					}
				}
			}
			if (currentList.size() > 0) {
				result.add(level + 1, currentList);
			} else {
				break;
			}
			level++;
		}

		List<List<Integer>> output = new ArrayList<List<Integer>>();

		level = 0;
		List<Integer> rootList = new ArrayList<Integer>();
		rootList.add(root.val);
		output.add(level, rootList);
		
		while (true) {
			List<Integer> currentOutput = new ArrayList<Integer>();
			if (level >= result.size()) {
				break;
			}
			for (int i = 0; i < result.get(level).size(); i++) {
				TreeNode node = result.get(level).get(i);
				if (node != null) {
					if (node.left != null) {
						currentOutput.add(node.left.val);
					}
					if (node.right != null) {
						currentOutput.add(node.right.val);
					}
				}
			}
			if (currentOutput.size() > 0) {
				output.add(level + 1, currentOutput);
			} else {
				break;
			}
			level++;
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
		node2.left = node4;
		node3.right = node5;
		LeetCode102 l = new LeetCode102();
		System.out.println(l.levelOrder(node1));
	}
}
