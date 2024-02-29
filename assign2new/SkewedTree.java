package assign2new;

public class SkewedTree {

	Node root;
	Node head;

	// constructor
	public SkewedTree() {
		this.root = null;
		this.head = null;
	}

	// function to convert BST to right skewed tree
	public void bstToRightSkewed(Node node) {
		if (node == null) {
			return;
		}

		// Recurse for the left subtree
		bstToRightSkewed(node.left);

		// now process the current node
		Node rightNode = node.right;
		if (head == null) {
			head = node;
			root = node;
			node.left = null;
		} else {
			root.right = node;
			node.left = null;
			root = node;
		}

		// finally recurse for the right subtree
		bstToRightSkewed(rightNode);
	}

	// function to print the right skewed tree
	public void printSkewedTree() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}

}
