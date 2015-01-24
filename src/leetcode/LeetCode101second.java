package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode101second {
	public boolean isSymmetric(TreeNode root) {
        if (root == null) {
        	return true;
        }
        if (root.left == null && root.right == null) {
        	return true;
        }
        List<List<TreeNode>> lists = new ArrayList<List<TreeNode>>();
        List<TreeNode> rootNode = new ArrayList<TreeNode>();
        rootNode.add(root);
        lists.add(0, rootNode);
        //System.out.println(lists.get(0).size());
        int level = 0;
        while(true) {
        	List<TreeNode> levelNodes = new ArrayList<TreeNode>();
        	for (int i = 0; i < lists.get(level).size(); i++) {
        		//System.out.println(levelNodes);
        		TreeNode node = lists.get(level).get(i);
        		if (node != null) {
        			levelNodes.add(lists.get(level).get(i).left);
            		levelNodes.add(lists.get(level).get(i).right);
        		}       		
        	}
        	if (levelNodes.size() == 0) {
        		break;
        	} else {
        		level++;
        		lists.add(level, levelNodes);
        	}
        }
        System.out.println(lists.size());
        System.out.println(lists.get(0).size());
        System.out.println(lists.get(1).size());
        System.out.println(lists.get(2).size());
        for(int i = 0; i < lists.size() - 1; i++) {
        	for(int j = 0; j < lists.get(i).size(); j++) {
        		if (lists.get(i).get(j) == null && lists.get(i).get(lists.get(i).size() - 1 - j) == null) {
        			continue;
        		} else if (lists.get(i).get(j) == null || lists.get(i).get(lists.get(i).size() - 1 - j) == null) {
        			return false;
        		} else if (lists.get(i).get(j).val != lists.get(i).get(lists.get(i).size() - 1 - j).val) {
        			return false;
        		}
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(3);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		LeetCode101second l = new LeetCode101second();
		System.out.println(l.isSymmetric(node1));
		
	}
}
