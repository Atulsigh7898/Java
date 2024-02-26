class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both trees are null, they are the same
        if (p == null && q == null)
            return true;
        // If one of the trees is null and the other is not, they are different
        if (p == null || q == null)
            return false;
        // If the values of the current nodes are different, the trees are different
        if (p.val != q.val)
            return false;
        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
    public static void main(String[] args) {
        SameTree solution = new SameTree();
        
        // Example usage:
        // Constructing tree 1
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Constructing tree 2
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        // Check if the two trees are the same
        boolean result = solution.isSameTree(p, q);
        System.out.println("Are the two trees the same? " + result); // Output: true
    }
}
