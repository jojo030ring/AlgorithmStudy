package linkedlist;
class Node1 {
	int data;
	Node1 left;
	Node1 right;
	Node1() {
		
	}
}
class Tree {
	public Node1 root;
	public void setRoot(Node1 root) {
		this.root = root;
	}
	public Node1 makeNode(Node1 left, int data, Node1 right) {
		Node1 node = new Node1();
		node.data = data;
		node.left = left;
		node.right = right;
		
		return node;
	}
	
	public void inorder(Node1 node) {
		if(node!=null) { // node가 null이 아닐동안 재귀호출
			inorder(node.left);
			System.out.print(node.data);
			inorder(node.right);
		}
		
	}
	public void preorder(Node1 node) {
		if(node != null) {
			System.out.print(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(Node1 node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data);
			
		}
	}
	
}
public class Tree_traversal {
	public static void main(String[] args) {
		Tree t = new Tree();
		Node1 n4 = t.makeNode(null,4,null); // 마지막 노드부터 생성함
		Node1 n5 = t.makeNode(null,5,null);
		Node1 n2 = t.makeNode(n4, 2, n5);
		Node1 n3 = t.makeNode(null, 3, null);
		Node1 n1 = t.makeNode(n2, 1, n3);
		
		t.setRoot(n1);
		t.inorder(n1);
		t.preorder(n1);
		t.postorder(n1);
		
		
		
	}
}
