import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


public class leetcode572_subtree_of_another_tree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null && t==null) return true;
        List<TreeNode> treeList = new ArrayList<TreeNode>();
        search(s, t.val, treeList);
        for(TreeNode node : treeList){
            if(helper(node,t)) return true;
        }
        return false;


    }
    private void search(TreeNode s, int target, List<TreeNode> treelist){
        if(s == null) return;
        if(s.val == target) treelist.add(s);
        search(s.left, target, treelist);
        search(s.right, target, treelist);

        return;


    }

    private boolean helper(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s== null && t != null || s != null && t == null ) return false;
        if(s.val != t.val) return false;
        return helper(s.left,t.left) && helper(s.right, t.right);

    }
}
