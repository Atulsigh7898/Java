import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class UniqueBSTs {

    public static List<TreeNode> generateTrees(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        return generateTrees(1, n);
    }

    private static List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftSubtrees = generateTrees(start, i - 1);
            List<TreeNode> rightSubtrees = generateTrees(i + 1, end);

            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<TreeNode> uniqueBSTs = generateTrees(n);

        // Do something with the generated trees (e.g., print or traverse)
        for (TreeNode root : uniqueBSTs) {
            // Perform any operation on the BST roots
            // (e.g., print the tree, traverse, etc.)
            System.out.println("Tree Structure:");
            printTree(root);
            System.out.println();
        }
    }

    private static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
