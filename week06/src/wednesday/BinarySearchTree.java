package wednesday;

public class BinarySearchTree {

	public class Node {
		private Node leftChild;
		private Node rightChild;
		// private Node parent;
		int data;

		public Node(int data) {
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
	}

	private Node root;

	public BinarySearchTree(Node root) {
		this.root = root;
	}

	public boolean add(Node nodeToAdd) {
		if (this.root == null) {
			this.root = nodeToAdd;
		}
		Node helperNode = this.root;
		while (true) {
			if (nodeToAdd.data < helperNode.data) {
				if (helperNode.leftChild == null) {
					helperNode.leftChild = new Node(nodeToAdd.data);
					System.out.println("Adding " + nodeToAdd.data);
					return true;
				} else {
					helperNode = helperNode.leftChild;
				}
			} else {
				if (helperNode.rightChild == null) {
					helperNode.rightChild = new Node(nodeToAdd.data);
					System.out.println("Adding " + nodeToAdd.data);
					return true;
				} else {
					helperNode = helperNode.rightChild;
				}
			}
		}
	}

}
