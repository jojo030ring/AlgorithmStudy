package linkedlist;

public class MySingleLinkedList<T> {
	public Node<T> head;
	public int size; // 보유하고 있는 노드의 개수
	public MySingleLinkedList() {
		head = null;
		size =  0;
	}
	// 삽입, 삭제, 검색
	public void addFirst(T item) {
		Node<T> newNode=  new Node<T>(item);// T : type parameter : ok
		/**
		 * T t = new T() // not ok
		 * 가상 클래스의 인스턴스를 생성하는건 안된다
		 * T[] array = new T[100]; 이것도 안 된다.
		 * 
		 * 근데 이건 또 안돼
		 * Node<T>[] arr = new Node<T>[100];
		 * 
		 * 
		 */
		
		newNode.next = head;
		head = newNode;
		size ++;
		
	}
	public void add(int index, T item) {
		// 노드를 새로 만들어서 끼워넣어라
		if (index< 0 || index > size) {
			return;
		}
		if(index ==0) {
			addFirst(item);
			return;
		}
		Node<T> p = getNode(index-1);
		addAfter(p, item);
		size++;
		
		
	}
	public void addAfter(Node<T> before, T item) {
		Node<T> newNode = new Node<T>(item);
		if(before==null)
			before = newNode;
		newNode.next = before.next;
		before.next = newNode;
		size ++;
		
	}
	
	public T removeFirst() {
		if(head == null) {
			System.out.println("삭제할 데이터가 없음");
			return null;
		}
		T item = head.data;
		head = head.next;
		size --;
		return item;
	}
	
	public T removeAfter(Node<T> before) {
		if(before == null||before.next==null) { // before가 null이거나 before가 마지막 노드인 경우.
			System.out.println("삭제할 데이터가 없음.");
			return null;
		}
		T item = before.next.data; // 첫 번째 노드부터 n-1 노드까지 가능한 로직
		before.next = before.next.next;
		size --;
		return item;
	}
	public T remove(int index) {
		// 그 데이터를 지정하는 노드를 삭제해라
		// 이전 노드의 주소를 얻어야 한다.
		if (index < 0 || index >=size) {
			return null;
		}
		if(index == 0) {
			return removeFirst();
		}
		Node<T> prev = getNode(index-1);
		return removeAfter(prev);
		
	}
	
	public T remove(T item) {
		// 삭제 + 검색
		Node<T> p = head;
//		while(p!=null && p.data.equals(item)) {
//			p=p.next;
//		}
		// 삭제할 노드만 가지고는 삭제가 불가능
		// 이전노드도 필수
		Node<T> q = null; 
		while(p!=null && !p.data.equals(item) ) {
			q=p;
			p=p.next;
		}
		if(p==null)
			return null;
		if(q==null)
			return removeFirst();
		else 
			return removeAfter(q);
	}
	
	public int indexOf(T item) {
		Node<T> p = head;
		int index = 0;
		while(p!=null) {
			if(p.data.equals(item)) { // java의 모든 메서드는 equals를 갖기 때문에
									  // 다만, 구현은 되어있어야 한다
				return index;
			}
			p = p.next;
			index++;
		} // 내가 찾는 값이 존재하지 않을 때 while문을 빠져나오게 된다.
		return -1;
	}
	
	public Node<T> getNode(int index) {
		// index번째 리스트 노드를 반환하는 것
		
		if(size<=index || index<0) { // index는 0번부터 시작
			return null;
		}
		Node<T> p = head;
		for(int i=0;i<index;i++) {
			p=p.next;
		}
		return p;
	}
	
	public T get(int index) {
		if(size<=index || index<0) { // index는 0번부터 시작
			return null;
		}
		Node<T> target = getNode(index);
		return target.data;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.add(0, "Monday");
		list.add(1, "Friday");
		list.add(2, "Saturday");
		list.add(3, "Tuesday");
		
		String str=list.get(2);
		list.remove(2);
		int pos = list.indexOf("Tuesday");
		System.out.println(str);
		System.out.println(pos);
	}
}
