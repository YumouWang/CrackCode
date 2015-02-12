package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode95 {
    public List<TreeNode> generateTrees(int n) {
    	List<TreeNode> result = new ArrayList<TreeNode>();
    	if (n == 0) {
    		result.add(null);
    		return result;
    	}
    	if (n == 1) {
    		result.add(new TreeNode(1));
    		return result;
    	}
        List<Integer> nodeValues = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
        	nodeValues.add(i);
        }
        return doGenerateTrees(nodeValues);
    }
    
    public List<TreeNode> doGenerateTrees(List<Integer> nodeValues) {
    	List<TreeNode> result = new ArrayList<TreeNode>();
    	if (nodeValues.size() == 0) {
    		return null;
    	}
    	if (nodeValues.size() == 1) {
    		TreeNode treeNode = new TreeNode(nodeValues.get(0));
    		result.add(treeNode);
    		return result;
    	}
    	for (int i = 0; i < nodeValues.size(); i++) {
    		if (i == 0) {
    			List<TreeNode> right = doGenerateTrees(nodeValues.subList(1, nodeValues.size()));
    			for (TreeNode node : right) {
    				TreeNode treeNode = new TreeNode(nodeValues.get(i));
    				treeNode.right = node;
    				result.add(treeNode);
    			}
    		} else if (i == nodeValues.size() - 1) {
    			List<TreeNode> left = doGenerateTrees(nodeValues.subList(0, nodeValues.size() - 1));
    			for (TreeNode node : left) {
    				TreeNode treeNode = new TreeNode(nodeValues.get(i));
    				treeNode.left = node;
    				result.add(treeNode);
    			}
    		} else {
    			List<TreeNode> left = doGenerateTrees(nodeValues.subList(0, i));
    			List<TreeNode> right = doGenerateTrees(nodeValues.subList(i + 1, nodeValues.size()));
    			for (TreeNode nodeLeft : left) {
    				for (TreeNode nodeRight : right) {
    					TreeNode treeNode = new TreeNode(nodeValues.get(i));
    					treeNode.left = nodeLeft;
    					treeNode.right = nodeRight;
    					result.add(treeNode);
    				}
    			}
    		}    		
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	List<Integer> nodeValues = new ArrayList<Integer>();
    	nodeValues.add(1);
    	nodeValues.add(2);
    	nodeValues.add(3);
    	nodeValues.add(4);
    	System.out.println(nodeValues.subList(3, 4) + "," + nodeValues.subList(2, 3).size());
    	LeetCode95 l = new LeetCode95();
    	TreeNode root = l.generateTrees(3).get(0);
    	System.out.println(root.val);
    	System.out.println(root.right.val);
    	System.out.println(root.right.right.val);
    }

}
