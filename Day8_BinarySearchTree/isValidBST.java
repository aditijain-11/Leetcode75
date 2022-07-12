public class isValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public boolean isValid(TreeNode root, Integer forRight, Integer forLeft) {
        if (root == null)
            return true;
        if ((forRight != null && root.val <= forRight) || (forLeft != null && root.val >= forLeft)) {
            return false;
        }
        return isValid(root.left, forRight, root.val) && isValid(root.right, root.val, forLeft);
    }

}
