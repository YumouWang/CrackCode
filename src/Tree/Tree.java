package Tree;

import java.util.ArrayList;

public class Tree {
	TreeNode root;

	public void insert(int value) {
		TreeNode newNode = new TreeNode(null, null, null, value);
		TreeNode parentNode = null;
		TreeNode currentNode;
		if (root == null) {
			root = newNode;
			return;
		}
		currentNode = root;
		while (currentNode != null) {
			parentNode = currentNode;
			if (value < currentNode.value) {
				currentNode = currentNode.leftChild;
			} else {
				currentNode = currentNode.rightChild;
			}
		}

		if (value < parentNode.value) {
			parentNode.leftChild = newNode;
			newNode.parent = parentNode;
		} else {
			parentNode.rightChild = newNode;
			newNode.parent = parentNode;
		}
	}
	
	public int getMaxDepth(TreeNode treeNode) {
		if(treeNode == null) {
			return 0;
		} 
		return 1 + Math.max(getMaxDepth(treeNode.leftChild), getMaxDepth(treeNode.rightChild));
	}
	
	public int getMinDepth(TreeNode treeNode) {
		if(treeNode == null) {
			return 0;
		} 
		return 1 + Math.min(getMinDepth(treeNode.leftChild), getMinDepth(treeNode.rightChild));
	}
	
	public int getHeight(TreeNode treeNode) {
		if (treeNode == null) {
			return -1;
		} 
		if (treeNode.leftChild == null && treeNode.rightChild == null) {
			return 0;
		}
		return (Math.max(getHeight(treeNode.leftChild),getHeight(treeNode.rightChild)) + 1);
	}
	
	public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getHeight(root.leftChild) - getHeight(root.rightChild)) > 1) {
            return false;
        }
        return isBalanced(root.leftChild) && isBalanced(root.rightChild);
   }
	
	public TreeNode midInsert(int[] array, int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode treeNode = new TreeNode(null, null, null, array[mid]);
		treeNode.leftChild = midInsert(array, start, mid - 1);
		treeNode.rightChild = midInsert(array, mid + 1, end);
		return treeNode;
	}
	
	public void printTree(TreeNode treeNode) {
		System.out.print(treeNode.value + ",");
		System.out.println();
		if(treeNode.leftChild != null) {
			printTree(treeNode.leftChild);
		}
		if (treeNode.rightChild != null) {
			printTree(treeNode.rightChild);
		}
	}
	
	public ArrayList<ArrayList<TreeNode>> levelLinkList(TreeNode treeNode) {
		ArrayList<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		int level = 0;
		list.add(treeNode);
		result.add(level, list);
		while(true) {
			list = new ArrayList<TreeNode>();
			for(int i = 0; i < result.get(level).size(); i++ ) {
				TreeNode node = result.get(level).get(i);
				if(node != null) {
					if(node.leftChild != null) {
						list.add(node.leftChild);
					}
					if(node.rightChild != null) {
						list.add(node.rightChild);
					}	
				}
			}
			if(list.size() > 0) {
				result.add(level + 1, list);
			} else {
				break;
			}
			level ++;
		}
		return result;
	}
	
	public boolean isCovered(TreeNode root, TreeNode treeNode) {
		if(root == null) {
			return false;
		}
		if(root == treeNode) {
			return true;
		}
		return isCovered(root.leftChild, treeNode) || isCovered(root.rightChild, treeNode);
	}
	
	public TreeNode commonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
		if(isCovered(root.leftChild, node1) && isCovered(root.rightChild, node2)) {
			return commonAncestor(root.leftChild, node1, node2); 
		}
		if(isCovered(root.rightChild, node1) && isCovered(root.rightChild, node2)) {
			return commonAncestor(root.rightChild, node1, node2);
		}
		return root;
	}	

	public static void main(String[] args) {
		int[] nodes = new int[] { 10, 8, 12, 13, 5, 1 };
		Tree tree = new Tree();
		for (int i = 0; i < nodes.length; i++) {
			tree.insert(nodes[i]);
		}
		System.out.println(tree.root.value);
		System.out.println(tree.root.leftChild.value + "," + tree.root.rightChild.value);
		System.out.println(tree.root.leftChild.leftChild.value + "," + tree.root.rightChild.rightChild.value);
		
		System.out.println("MaxDepth:" + tree.getMaxDepth(tree.root));
		System.out.println("MinDepth" + tree.getMinDepth(tree.root));
		
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		Tree t = new Tree();
		t.root = t.midInsert(array, 0, 10);
		System.out.println(t.root.value);
		t.printTree(t.root);
		
		ArrayList<ArrayList<TreeNode>> t2 = new ArrayList<ArrayList<TreeNode>>();
		t2 = t.levelLinkList(t.root);
		for (ArrayList<TreeNode> list : t2) {
			for (TreeNode node : list) {
				System.out.print(node.value + ",");
			}
			System.out.println();
		}
		
		System.out.println("height:" + t.getHeight(t.root));
		System.out.println("isBalanced:" + t.isBalanced(t.root));
		
		TreeNode commonAncestor = t.commonAncestor(t.root, t.root.leftChild.leftChild, t.root.leftChild.rightChild);
		System.out.println(commonAncestor.getValue());
	}
}
