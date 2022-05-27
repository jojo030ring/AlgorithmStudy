import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Graph {
	// Node 생성.
	class Node {
		int data; // 실질적인 데이터
		LinkedList<Node> adjacent = new LinkedList<Node>(); // 그래프의 자식 노드를 나타내기 위해 사용하는 LinkedList
		boolean marked; // 방문 여부
		/**
		 * 생성자로 데이터를 받아오고
		 * 방문여부는 false로 초기화해준다. 
		 * 	@param data
		 */
	Node(int data){
		this.data = data; 
		this.marked = false;
		}
	}
	// 노드를 담아줄 인접행렬 생성
	Node[] nodes;
	Graph(int size) {
		nodes = new Node[size]; // 노드 개수를 받아 노드만큼 배열방을 생성해줌
		for(int i=0;i<size;i++) {
			nodes[i] = new Node(i);
			// 인덱스가 노드의 데이터라고 할 수 있다.
		}
		
	}
	/**
	 * 간선을 추가해주는 메서드
	 * @param i1 : 배열방의 인덱스이자 노드의 값
	 * @param i2 : 배열방의 인덱스이자 노드의 값
	 * 두 점을 연결한 것이 바로 간선
	 */
	void addEdge(int i1, int i2) {
		Node n1 = nodes[i1];	// 배열방의 요소를 얻어옴
		Node n2 = nodes[i2];
		/**
		 * "연결"의 의미 : 인접 행렬의 인접노드를 나타내는 리스트에
		 * 요소가 추가된 경우.
		 */
		if(!n1.adjacent.contains(n2)) { // n1의 인접노드 중에 n2가 ㅇ벗는 경우  
			n1.adjacent.add(n2); // n2 추가
		}
		if(!n2.adjacent.contains(n1)) { // n2에도 같은 작업을 한다.
			n2.adjacent.add(n1);
		}
		
	}
	/**
	 * 그냥 dfs()를 호출했을 땐 0번을 루트노드로 하도록 한다.
	 */
	void dfs() {
		dfs(0); // dfs(int index)
	}
	
	void dfs(int index) {
		Node root = nodes[index]; // 인덱스번째 노드 정보를 받아옴
		// 스택 생성 > DFS는 스택으로 연산
		Stack<Node> stack = new Stack<Node>();
		// 스택에 루트노드 값을 넣는다.
		stack.push(root);
		// 루트노드를 순회했으니 marked를 true로 변경해준다.
		root.marked = true;
		
		while(!stack.isEmpty()) {
			// 스택에서 데이터를 꺼냄
			Node r =stack.pop();
			// 인접 노드를 순회
			for(Node n :r.adjacent) {
				// 순회하지 않았던 노드라면..
				if(n.marked == false) {
					// 순회해주고
					n.marked = true;
					// 스택에 넣어준다
					stack.push(n);
				}
			}
			// stack에서 pop한 노드를 출력해준다.
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
	// 시작 노드를 다르게 해보기 위해 배열방의 인덱스를 사용하는 함수
	/**
	 * 인덱스 받으면 노드를 찾아서
	 * 해당 노드를 시작으로 재귀호출을 진행함
	 * @param index
	 */
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	
	void dfsR() {
		// 아무것도 넘기지 않았을 때는 0부터 시작
		dfsR(0);
	}
}


public class DFSTest {
	public static void main(String[] args) {
		Graph g = new Graph(9);
		
		// 관계 명시
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		// 관계를 추가하면 양쪽노드에 추가가 됨
		// 한 번 명시한 관계는 또다시 명시할 필요가 ㅇ벗음.
		g.addEdge(5,6);
		g.addEdge(5,7);
		g.addEdge(5,8);
		g.dfsR(3);
		
	}
}
