package assign2new;

public class Driver {

	public static void main(String[] args) {
		SkewedTree tree = new SkewedTree();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left = new Node(55);

		tree.bstToRightSkewed(tree.root);
		tree.printSkewedTree();
	}

}
