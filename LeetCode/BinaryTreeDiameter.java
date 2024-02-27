class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTreeDiameter {
    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        calculateDepth(root);
        return diameter;
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        // Update diameter if necessary
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        BinaryTreeDiameter solution = new BinaryTreeDiameter();

        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the binary tree: " + solution.diameterOfBinaryTree(root));
    }
}
