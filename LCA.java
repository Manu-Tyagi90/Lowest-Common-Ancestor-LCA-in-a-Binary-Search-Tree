//  import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x, TreeNode y, TreeNode z) {
        val = x;
        left = y;
        right = z;
    }
}

public class LCA {
    public static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (p.val < root.val && q.val < root.val) {
            return LCA(root.left, p, q);
        }
        if (q.val > root.val && p.val > root.val) {
            return LCA(root.right, p, q);
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6, new TreeNode(2, new TreeNode(0, null, null), new TreeNode(4, new TreeNode(3, null, null), new TreeNode(5, null, null))),
                new TreeNode(8, new TreeNode(7, null, null), new TreeNode(9, null, null)));
        /*           6
            *       / \
            *      2   8
            *     / \ / \
            *    0  4 7  9
            *      / \
            *     3  5
         * 
         */

        TreeNode p = new TreeNode(7, null, null);
        TreeNode q = new TreeNode(8, null, null);
        System.out.println(LCA(root, p, q).val); 
    
    }

}
