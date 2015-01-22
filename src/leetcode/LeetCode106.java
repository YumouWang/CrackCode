package leetcode;

public class LeetCode106 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 && postorder.length == 0) {
        	return null;
        }
        return doBuildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
	
	public TreeNode doBuildTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
		if (iEnd < iStart) {
        	return null;
        }
		
		TreeNode root = new TreeNode(postorder[pEnd]);
		int i = 0;
		for (i = iStart; i < iEnd; i ++) {
			if (inorder[i] == postorder[pEnd]) {
				break;
			}
		}		
		int leftNum = i - iStart;
		root.left = doBuildTree(inorder, iStart, i - 1, postorder, pStart, pStart + leftNum - 1);;
		root.right = doBuildTree(inorder, i + 1, iEnd , postorder, pStart + leftNum, pEnd - 1);		
		return root;
    }
	
	public static void main(String[] args) {
		int[] inorder = new int[] {3, 2, 4, 1, 6, 5, 7};
		int[] postorder = new int[]	{3, 4, 2, 6, 7, 5, 1};
		LeetCode106 l = new LeetCode106();
		System.out.println(l.buildTree(inorder, postorder).val);
		System.out.println(l.buildTree(inorder, postorder).left.val);
		System.out.println(l.buildTree(inorder, postorder).right.val);
		System.out.println(l.buildTree(inorder, postorder).left.left.val);
		System.out.println(l.buildTree(inorder, postorder).left.right.val);
		System.out.println(l.buildTree(inorder, postorder).right.left.val);
		System.out.println(l.buildTree(inorder, postorder).right.right.val);
	}

}
