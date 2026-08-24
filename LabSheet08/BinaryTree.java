
public class BinaryTree {

	private Node root;

	public BinaryTree() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}

	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}
	
	public void createTree1() {

	}
	
	public void createTree2() {

	}
	
	public void createTree3() {

	}
	
}
