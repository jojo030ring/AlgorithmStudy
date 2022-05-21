package ch4_list;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class P1406 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine(); // ù ���ڿ��� �Է¹���
		int n = Integer.parseInt(br.readLine());	// ��ɾ �� �� �ݺ��� ������ �Է¹���
		String input= "";	// ��ɾ ���� ���ڿ�
		
		LinkedList<String> list =addElems(str); // LinkedList ����
		ListIterator<String> liter = list.listIterator(); // DoubleLinkedList�� ��� ListIterator�� �޾ƿ´�.
		
		/**
		 * Ŀ���� �����̹Ƿ�, listIterator�� ������ �����ش�.
		 */
		while(liter.hasNext()) {
			liter.nextIndex();
			
			liter.next();
			
		}

		
		for(int i=0;i<n;i++) {
			input = br.readLine(); // ����� �Է¹���
			StringTokenizer st= new StringTokenizer(input, " "); // ���� �������� ��ū�� �и�
			String command = st.nextToken(); // ������ ù ���ڴ� command�̹Ƿ� �̰͸� ���� �и�
			switch(command) {
			/**
			 * Ŀ���� �� ������ �� ĭ �ű�
			 * Ŀ���� ������ �� ���̸� ���õ�
			 */
				case "L":	
					if(liter.hasPrevious()) {
						liter.previous();
					}
					
					break;
			/**
			 * Ŀ�� ���������� �� ĭ �ű�(������ �� �ڸ� ���õ�) 
			 */
				case "D":
					if(liter.hasNext()) {
						liter.next();
					}
					break;
			/**
			 * Ŀ�� ���ʿ� �ִ� ���� ����(Ŀ���� ������ �� ���̸� ����)
			 * ������ ���� Ŀ���� �� ĭ �������� �Űܰ� ��ó�� ��Ÿ����,
			 * ������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״��.
			 */
				case "B":
					if(liter.hasPrevious()) {
						liter.previous(); // ���������� �о�� ���� �����ϹǷ� �̸� �� ���־�� �Ѵ�
						liter.remove();
					}
					break;
				case "P":
				/**
				 * ���ڸ� Ŀ�� ���ʿ� �߰�
				 */
					
					 String putItem = st.nextToken();
					 liter.add(putItem); // add�� �׳� �߰��ص� ��� ����. next�� previous�� �ʿ� ����
					 break;
			}
			
		}
		
		for(String result : list) {
			bw.write(result);
		}
		bw.close();
		br.close();
		
		
	}
	
	public static LinkedList<String> addElems( String str) {
		LinkedList<String> ll = new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			ll.add(str.charAt(i)+"");
		}
		return ll;
		
	}
}
