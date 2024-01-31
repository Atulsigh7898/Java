// InorderTraversal.java

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        InorderTraversal solution = new InorderTraversal();

        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Get the inorder traversal
        List<Integer> inorderList = solution.inorderTraversal(root);

        // Print the result
        System.out.println("Inorder Traversal: " + inorderList);
    }
}
