package Tree;

public class BinaryTree {
	public TreeNode root = null;
	
	class TreeNode {
		public TreeNode parent;
		public TreeNode leftChild;
		public TreeNode rightChild;
		//private int count;
		public int key;
		
		public TreeNode(int key, TreeNode leftChild, TreeNode rightChild,TreeNode parent) {
			this.key = key;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
			this.parent = parent;
		}
		
		public int getKey() {
			return this.key;
		}
	}
		public TreeNode getRoot() {
			return root;
			
		}
		public int getMaxDepth(TreeNode root) {
			if(root == null) {
				return 0;
			}
			return 1 + Math.max(getMaxDepth(root.leftChild), getMaxDepth(root.rightChild));
		}
		
		public int getMinDepth(TreeNode root) {
			if(root == null) {
				return 0;
			}
			return 1 + Math.min(getMinDepth(root.leftChild), getMinDepth(root.rightChild));
		}
		
		public void insert(int key) {
			TreeNode newNode = new TreeNode(key, null, null, null);
			TreeNode parentNode = null;
			TreeNode pNode = root;
			if(root == null) {
				root = newNode;
				return;
			}
			while(pNode != null) {
				parentNode = pNode;
				if(key < pNode.key) {
					pNode = pNode.leftChild;
				}
				else if(key > pNode.key) {
					pNode = pNode.rightChild;
				}
				else {
					return;
				}
			}
			if(key < parentNode.key) {
				newNode.parent = parentNode;
				parentNode.leftChild = newNode;
			}
			else {
				newNode.parent = parentNode;
				parentNode.rightChild = newNode;
			}
		}
		public static void main(String[] args) {
			BinaryTree bt = new BinaryTree();
			int[] keys = new int[]{17, 2, 20, 30};
			for (int key : keys){
				bt.insert(key);
				}
			System.out.println("The root of this tree is: " + bt.getRoot().getKey() + ",leftChild = " + bt.getRoot().leftChild.getKey());
			System.out.println(bt.getMaxDepth(bt.getRoot()));
			System.out.println(bt.getMinDepth(bt.getRoot()));
		}
}
