public class Traversal {

    // Node class
    static class Node {

        int data;
        Node left, right;

        // Constructor
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Index for array traversal
    static int idx = -1;

    // Build Binary Tree
    static Node buildTree(int nodes[]) {

        idx++;

        // If -1 means NULL node
        if (nodes[idx] == -1) {
            return null;
        }

        // Create new node
        Node newNode = new Node(nodes[idx]);

        // Build left subtree
        newNode.left = buildTree(nodes);

        // Build right subtree
        newNode.right = buildTree(nodes);

        return newNode;
    }

    // Preorder Traversal
    // Root Left Right
    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);

        preorder(root.right);
    }

    // Inorder Traversal
    // Left Root Right
    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    // Postorder Traversal
    // Left Right Root
    static void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);

        postorder(root.right);

        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        // Tree in preorder format
        int nodes[] = {
            1, 2, 4, -1, -1,
            5, -1, -1,
            3, -1, 6, -1, -1
        };

        // Build tree
        Node root = buildTree(nodes);

        // Preorder
        System.out.println("Preorder Traversal:");
        preorder(root);

        System.out.println();

        // Inorder
        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println();

        // Postorder
        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}
