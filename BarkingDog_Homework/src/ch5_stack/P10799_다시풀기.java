package ch5_stack;
import java.util.*;
import java.io.*;
public class P10799_�ٽ�Ǯ�� {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input; // ��ȣ�� �������� �Է¹޴� ����
		char prev='0'; // ������ ���Դ� ���ڸ� ����ϴ� ����
		char target; // ������ ���ڸ� ����ϴ� ����
		int cnt=0; // ö���� ������ ���� ����
		Stack<Character> st = new Stack<Character>();
		
		input = br.readLine();
		
		for (int i =0;i<input.length();i++ ) {
			System.out.println(i+""+st);
			target = input.charAt(i);
			if(target == '(') {
				st.push(target);
			} 
			else if(prev == '(' && target==')')  {
				st.pop();
				cnt+=st.size();
			} else if(prev == ')' && target ==')') {
				st.pop();
				cnt ++;
			}
			prev = target;
		}
		bw.write(""+cnt);
		bw.close();
		br.close();
		
		
		
	}
}
