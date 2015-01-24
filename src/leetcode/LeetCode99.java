package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode99 {
	public void recoverTree(TreeNode root) {
        if (root == null) {
        	return;
        }
        if (root.left == null && root.right == null) {
        	return;
        }
        List<Integer> nodeValueList = new ArrayList<Integer>();
        inOrder(root, nodeValueList);
        
        int temp1 = 0;
        int temp2 = 0;
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < nodeValueList.size(); i++) {
        	temp.add(i, nodeValueList.get(i));
        }
        Collections.sort(temp);
        for (int i = 0; i < nodeValueList.size(); i++) {
        	if (temp.get(i) > nodeValueList.get(i)) {
        		temp1 = nodeValueList.get(i);
        	}
        	if (temp.get(i) < nodeValueList.get(i)) {
        		temp2 = nodeValueList.get(i);
        	}
        }
        
        recoverTree(root, temp1, temp2);
        System.out.println(nodeValueList + "," + temp1 + "," + temp2);
        inOrder(root, nodeValueList);
        System.out.println(nodeValueList);
        System.out.println(temp);
    }
	
	public void recoverTree(TreeNode root, int value1, int value2) {
		if (root == null) {
			return;
		}
		recoverTree(root.left, value1, value2);
		if (root.val == value1) {
			root.val = value2;
		} else if (root.val == value2) {
			root.val = value1;
		}
		recoverTree(root.right, value1, value2);
	}
	
	public void inOrder(TreeNode root, List<Integer> nodeValueList) {
		if (root == null) {
			return;
		}
		inOrder(root.left, nodeValueList);
		nodeValueList.add(root.val);
		inOrder(root.right, nodeValueList);
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
//		TreeNode node4 = new TreeNode(4);
//		TreeNode node5 = new TreeNode(3);
//		TreeNode node6 = new TreeNode(6);
//		TreeNode node7 = new TreeNode(7);
		
//		node4.left = node2;
//		node4.right = node6;
//		node2.left = node1;
//		node2.right = node3;
//		node6.left = node5;
//		node6.right = node7;
		node1.left = node2;
		node1.right = node3;
		
		LeetCode99 l = new LeetCode99();
		l.recoverTree(node1);
	}

}
