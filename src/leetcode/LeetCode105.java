package leetcode;

public class LeetCode105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0 && inorder.length == 0) {
        	return null;
        }
        return doBuildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
	
	public TreeNode doBuildTree(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
		if (pEnd < pStart) {
        	return null;
        }
		
		TreeNode root = new TreeNode(preorder[pStart]);
		int i = 0;
		for (i = iStart; i < iEnd; i ++) {
			if (inorder[i] == preorder[pStart]) {
				break;
			}
		}		
		int leftNum = i - iStart;
		root.left = doBuildTree(preorder, pStart + 1, pStart + leftNum, inorder, iStart, i - 1);;
		root.right = doBuildTree(preorder, pStart + leftNum + 1, pEnd , inorder, i + 1, iEnd);		
		return root;
    }
	
	public static void main(String[] args) {
		int[] preorder = new int[]	{1, 2, 3, 4, 5, 6, 7};
		int[] inorder = new int[] {3, 2, 4, 1, 6, 5, 7};		
		LeetCode105 l = new LeetCode105();
		System.out.println(l.buildTree(preorder, inorder).val);
		System.out.println(l.buildTree(preorder, inorder).left.val);
		System.out.println(l.buildTree(preorder, inorder).right.val);
		System.out.println(l.buildTree(preorder, inorder).left.left.val);
		System.out.println(l.buildTree(preorder, inorder).left.right.val);
		System.out.println(l.buildTree(preorder, inorder).right.left.val);
		System.out.println(l.buildTree(preorder, inorder).right.right.val);
	}
	
	

}
