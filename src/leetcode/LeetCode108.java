package leetcode;

public class LeetCode108 {
	public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
        	return null;
        }
        TreeNode root = doSort(num, 0, num.length - 1);
        return root;
    }
	
	public TreeNode doSort(int[] num, int start, int end) {
		if (num.length == 0) {
			return null;
		}
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(num[mid]);
		node.left = doSort(num, start, mid - 1);
		node.right = doSort(num, mid + 1, end);
		return node;
	}
	
	public static void main(String[] args) {
		
	}

}
