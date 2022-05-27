import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Graph {
	// Node ����.
	class Node {
		int data; // �������� ������
		LinkedList<Node> adjacent = new LinkedList<Node>(); // �׷����� �ڽ� ��带 ��Ÿ���� ���� ����ϴ� LinkedList
		boolean marked; // �湮 ����
		/**
		 * �����ڷ� �����͸� �޾ƿ���
		 * �湮���δ� false�� �ʱ�ȭ���ش�. 
		 * 	@param data
		 */
	Node(int data){
		this.data = data; 
		this.marked = false;
		}
	}
	// ��带 ����� ������� ����
	Node[] nodes;
	Graph(int size) {
		nodes = new Node[size]; // ��� ������ �޾� ��常ŭ �迭���� ��������
		for(int i=0;i<size;i++) {
			nodes[i] = new Node(i);
			// �ε����� ����� �����Ͷ�� �� �� �ִ�.
		}
		
	}
	/**
	 * ������ �߰����ִ� �޼���
	 * @param i1 : �迭���� �ε������� ����� ��
	 * @param i2 : �迭���� �ε������� ����� ��
	 * �� ���� ������ ���� �ٷ� ����
	 */
	void addEdge(int i1, int i2) {
		Node n1 = nodes[i1];	// �迭���� ��Ҹ� ����
		Node n2 = nodes[i2];
		/**
		 * "����"�� �ǹ� : ���� ����� ������带 ��Ÿ���� ����Ʈ��
		 * ��Ұ� �߰��� ���.
		 */
		if(!n1.adjacent.contains(n2)) { // n1�� ������� �߿� n2�� ������ ���  
			n1.adjacent.add(n2); // n2 �߰�
		}
		if(!n2.adjacent.contains(n1)) { // n2���� ���� �۾��� �Ѵ�.
			n2.adjacent.add(n1);
		}
		
	}
	/**
	 * �׳� dfs()�� ȣ������ �� 0���� ��Ʈ���� �ϵ��� �Ѵ�.
	 */
	void dfs() {
		dfs(0); // dfs(int index)
	}
	
	void dfs(int index) {
		Node root = nodes[index]; // �ε�����° ��� ������ �޾ƿ�
		// ���� ���� > DFS�� �������� ����
		Stack<Node> stack = new Stack<Node>();
		// ���ÿ� ��Ʈ��� ���� �ִ´�.
		stack.push(root);
		// ��Ʈ��带 ��ȸ������ marked�� true�� �������ش�.
		root.marked = true;
		
		while(!stack.isEmpty()) {
			// ���ÿ��� �����͸� ����
			Node r =stack.pop();
			// ���� ��带 ��ȸ
			for(Node n :r.adjacent) {
				// ��ȸ���� �ʾҴ� �����..
				if(n.marked == false) {
					// ��ȸ���ְ�
					n.marked = true;
					// ���ÿ� �־��ش�
					stack.push(n);
				}
			}
			// stack���� pop�� ��带 ������ش�.
			visit(r);
		}
	}
	
	void visit(Node r) {
		System.out.println(r.data);
	}
	
	
	void bfs() {
		bfs(0);
	}
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		root.marked=true;
		
		while(!queue.isEmpty()) {
			Node r = queue.poll();
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					queue.offer(n);
				}
			}
			visit(r);
		}
		
	}
	void dfsR(Node r) {
		if(r == null) return;
		r.marked = true;
		visit(r);
		for(Node n : r.adjacent) {
			if(n.marked == false) {
				dfsR(n);
			}
		}
	}
	// ���� ��带 �ٸ��� �غ��� ���� �迭���� �ε����� ����ϴ� �Լ�
	/**
	 * �ε��� ������ ��带 ã�Ƽ�
	 * �ش� ��带 �������� ���ȣ���� ������
	 * @param index
	 */
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	
	void dfsR() {
		// �ƹ��͵� �ѱ��� �ʾ��� ���� 0���� ����
		dfsR(0);
	}
}


public class DFSTest {
	public static void main(String[] args) {
		Graph g = new Graph(9);
		
		// ���� ���
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		// ���踦 �߰��ϸ� ���ʳ�忡 �߰��� ��
		// �� �� ����� ����� �Ǵٽ� ����� �ʿ䰡 ������.
		g.addEdge(5,6);
		g.addEdge(5,7);
		g.addEdge(5,8);
		g.dfsR(3);
		
	}
}
