/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        traversal(root, 0, list);
        return list;

    }

    public void traversal(TreeNode root, int i, List<List<Integer>> list) {
        if (root == null)
            return;
        if (list.size() < i + 1)
            list.add(new ArrayList());
        list.get(i).add(root.val);
        traversal(root.left, i + 1, list);
        traversal(root.right, i + 1, list);
    }
}
