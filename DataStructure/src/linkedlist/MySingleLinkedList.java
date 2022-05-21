package linkedlist;

public class MySingleLinkedList<T> {
	public Node<T> head;
	public int size; // �����ϰ� �ִ� ����� ����
	public MySingleLinkedList() {
		head = null;
		size =  0;
	}
	// ����, ����, �˻�
	public void addFirst(T item) {
		Node<T> newNode=  new Node<T>(item);// T : type parameter : ok
		/**
		 * T t = new T() // not ok
		 * ���� Ŭ������ �ν��Ͻ��� �����ϴ°� �ȵȴ�
		 * T[] array = new T[100]; �̰͵� �� �ȴ�.
		 * 
		 * �ٵ� �̰� �� �ȵ�
		 * Node<T>[] arr = new Node<T>[100];
		 * 
		 * 
		 */
		
		newNode.next = head;
		head = newNode;
		size ++;
		
	}
	public void add(int index, T item) {
		// ��带 ���� ���� �����־��
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
			System.out.println("������ �����Ͱ� ����");
			return null;
		}
		T item = head.data;
		head = head.next;
		size --;
		return item;
	}
	
	public T removeAfter(Node<T> before) {
		if(before == null||before.next==null) { // before�� null�̰ų� before�� ������ ����� ���.
			System.out.println("������ �����Ͱ� ����.");
			return null;
		}
		T item = before.next.data; // ù ��° ������ n-1 ������ ������ ����
		before.next = before.next.next;
		size --;
		return item;
	}
	public T remove(int index) {
		// �� �����͸� �����ϴ� ��带 �����ض�
		// ���� ����� �ּҸ� ���� �Ѵ�.
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
		// ���� + �˻�
		Node<T> p = head;
//		while(p!=null && p.data.equals(item)) {
//			p=p.next;
//		}
		// ������ ��常 ������� ������ �Ұ���
		// ������嵵 �ʼ�
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
			if(p.data.equals(item)) { // java�� ��� �޼���� equals�� ���� ������
									  // �ٸ�, ������ �Ǿ��־�� �Ѵ�
				return index;
			}
			p = p.next;
			index++;
		} // ���� ã�� ���� �������� ���� �� while���� ���������� �ȴ�.
		return -1;
	}
	
	public Node<T> getNode(int index) {
		// index��° ����Ʈ ��带 ��ȯ�ϴ� ��
		
		if(size<=index || index<0) { // index�� 0������ ����
			return null;
		}
		Node<T> p = head;
		for(int i=0;i<index;i++) {
			p=p.next;
		}
		return p;
	}
	
	public T get(int index) {
		if(size<=index || index<0) { // index�� 0������ ����
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
