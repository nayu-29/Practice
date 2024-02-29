package assign2;

public class Main {
	
	Node root; // Root of the BST
    Node prevNode = null; // To keep track of the previously visited node
    Node newRoot = null; // Root of the right-skewed tree

    // Function to convert BST to right-skewed tree in ascending order
    public void convertToSkewed(Node root) {
        // Base case
        if (root == null) {
            return;
        }

        // Recursively convert the left subtree
        convertToSkewed(root.left);

        // If the new root is null, make the current root as the new root of the skewed tree
        if (newRoot == null) {
            newRoot = root;
            root.left = null; // The left child of each node in the skewed tree should be null
            prevNode = root;
        } else {
            // Adjusting the right child of the prevNode and updating prevNode
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        // Recursively convert the right subtree
        convertToSkewed(root.right);
    }

    // Function to traverse the right-skewed tree using in-order traversal and print the nodes
    public void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        traverseRightSkewed(root.right); // Move to the right child since it's a skewed tree
    }

    public static void main(String[] args) {
        Main tree = new Main();
        // Constructing the BST
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left = new Node(55);

        // Converting BST to right-skewed tree
        tree.convertToSkewed(tree.root);

        // Displaying the nodes of the right-skewed tree in ascending order
        System.out.println("The node values in the skewed tree in ascending order are:");
        tree.traverseRightSkewed(tree.newRoot);
    }

}
