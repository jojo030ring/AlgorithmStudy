package linkedlist;

public class Node<T>{ // generics�� ���� � �����͵� ���� �� �ְ� �Ѵ�.
	public T data;
	public Node<T> next; // �� �ڽŰ� ������ Ÿ���̾�� ��

	public Node(T item) {
		data = item;
		next= null;
	}
}
