package wednesday;

public class BSTDemo {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(null);
		BinarySearchTree.Node first = bst.new Node(10);
		BinarySearchTree.Node second = bst.new Node(2);
		BinarySearchTree.Node third = bst.new Node(4);
		BinarySearchTree.Node fourth = bst.new Node(13);
		
		
		bst.add(first);
		bst.add(second);
		bst.add(third);
		bst.add(fourth);
		
	}

}
