package Tree;

class Node{
	Node left;
	Node right;
	int val; 
	public Node(int val) {
		this.val=val;
	}
}
public class BinaryTree {
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left= new Node(40);
	}
 
}
