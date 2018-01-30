package interviews.preparation;

class TreeNode {
	Node left;
	Node right;
	int data;
	

	public TreeNode(int val) {
		data = val;
	}
}

	
	

public class Tree {
	
	Node node;
	
	
	

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.node = new Node(10);
		tree.node.left = new Node(7);
		tree.node.right = new Node(12);
		tree.node.left.left = new Node(5);
		tree.node.left.right = new Node(9);
		
	}

}
