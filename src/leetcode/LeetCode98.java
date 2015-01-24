package leetcode;

public class LeetCode98 {
	public boolean isValidBST(TreeNode root) {
        if (root == null) {
        	System.out.println("1");
        	return true;
        } else if (root.left == null && root.right == null) {
        	System.out.println("2");
        	return true;
        } else if (root.left == null && root.right != null) {
        	System.out.println("3");
        	if (root.val >= getMinValue(root.right)) {
        		return false;
        	} else {
        		return isValidBST(root.right);
        	}
        } else if (root.left != null && root.right == null) {
        	System.out.println("4");
        	if (root.val <= getMaxValue(root.left)) {
        		return false;
        	} else {
        		return isValidBST(root.left);
        	}
        } else {
        	if (root.val <= getMaxValue(root.left) || root.val >= getMinValue(root.right)) {
        		return false;
        	} else {
        		return isValidBST(root.left) && isValidBST(root.right);
        	}
        }
    }
	
	public int getMaxValue(TreeNode root) {
		int maxValue = 0;
		if (root.right == null) {
			return root.val;
		}
		while(root.right != null) {
			maxValue = root.right.val;
			root = root.right;
		}
		return maxValue;
	}
	
	public int getMinValue(TreeNode root) {
		int minValue = 0;
		if (root.left == null) {
			return root.val;
		}
		while(root.left != null) {
			minValue = root.left.val;
			root = root.left;
		}
		return minValue;
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(8);
		
		node1.left = node2;
		node1.right = node5;
		node2.left = node3;
		node2.right = node4;
		node5.left = node6;
		node5.right = node7;
		
		LeetCode98 l = new LeetCode98();
		System.out.println(l.isValidBST(node1));
	}

}
