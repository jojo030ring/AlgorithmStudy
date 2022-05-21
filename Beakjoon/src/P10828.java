import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10828 {
public static void main(String[] args) throws Exception {
	/**
	 * 1. �Է��� �޾ƾ���
		2. split�ؼ� ��ɾ�� ���ڸ� �и��ؾ��� > String[0]�� ��ɾ�. push�� ��츸 1�� �ε����� �����Ѵ�.
		3. switch������ ��� �غ��� �ɵ�
		4. �Է��� BufferedReader~�� �����ؼ� readLine���� ����
	 */
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int cnt = Integer.parseInt(br.readLine());
	String[] command = new String[2];
	int target = 0;
	Stack<Integer> st = new Stack<>();
	for(int i=0; i<cnt;i++) {
		command = br.readLine().split(" ");
		switch(command[0]) {
		case "push" :
			target = Integer.parseInt(command[1]);
			st.push(target);
			break;
		case "pop": 
			System.out.println((st.size()>0)? st.pop() : -1 );
			break;
		case "size":
			System.out.println(st.size());
			break;
		case "empty" :
			System.out.println((st.empty())? 1 : 0);
			break;
		case "top":
			System.out.println((st.size()>0)? st.peek() : -1);
			break;
		}
		
	}
	br.close();
}
	
	
	
	
}
