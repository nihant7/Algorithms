package interviews.preparation;

public class BinaryTree {
	
	public int min(Node node) {
		while(node != null) {
			System.out.println(node.value);
			node = node.left;
		}
		return node.value;
	}
	
	public int max(Node node) {
		while(node != null) {
			System.out.println(node.value);
			node = node.right;
		}
		return node.value;
	}
	
	public boolean delete(Node node, int value) {
		Node root = node;
		if(root == null) return false;
		
		
		while(root.value != value) {
			Node parent = root;
		
		if(root.value > value) {
			root = root.left;
		}
		
		if(root.value < value) {
			root = root.right;
		}
		
	}
		// No children
		if(root.left == null && root.right == null) {
			
		}
		
		// 1 child
		else if(root.left != null) {
			
		}
		
		else if(root.right != null) {
			
		}
		
		// 2 children
		if(root.left != null && root.right != null) {
			
		}
}
	
	public int search(Node node, int value) {
		if(node == null) return -1;
		
		while(true) {
			
		if(node == null) return -1;
		
		if(value == node.value) {
			return value;
		}
		
			if(value > node.value) {
				node = node.right;
			}
			
			else if(value < node.value) {
				node = node.left;
			}
			else { 
				return -1;
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(10);
		node.left = new Node(5);
		node.right = new Node(15);
		node.left.left = new Node(3);
		node.left.right = new Node(7);
		node.right.left = new Node(12);
		node.right.right = new Node(17);
		
		BinaryTree bt = new BinaryTree();
		System.out.println(bt.delete(node, 10));
	}

}
