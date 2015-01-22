package Tree;

public class TreeNode {
	public TreeNode parent;
	public TreeNode leftChild;
	public TreeNode rightChild;
	public int value;
	
	public TreeNode(TreeNode parent, TreeNode leftChild, TreeNode rightChild, int value) {
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
