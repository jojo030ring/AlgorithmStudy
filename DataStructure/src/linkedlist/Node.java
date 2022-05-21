package linkedlist;

public class Node<T>{ // generics를 통해 어떤 데이터든 받을 수 있게 한다.
	public T data;
	public Node<T> next; // 나 자신과 동일한 타입이어야 함

	public Node(T item) {
		data = item;
		next= null;
	}
}
