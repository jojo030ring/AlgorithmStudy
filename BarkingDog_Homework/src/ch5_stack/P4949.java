package ch5_stack;
import java.util.*;
import java.io.*;
public class P4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input ="";
		Stack<Character> st = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		int cnt=0;
		char ch;
		char peekCh;
		
			// 1. ������ �� �������� ���. : ������ ��ȸ�߰�(cnt), ���õ� ����ִ� ���
			// 2. ������ �� ���������� ���� ��� : 1_�� ���ÿ��� pop�Ϸ��� ���
			// 									   2_���� ���� �ȸ´� ���
			//								       3_�� ��ȸ�ߴµ��� ������ �Ⱥ���ִ� ���
			
			while(true) {
				input = br.readLine();
				if(input.equals(".")) {
					break;
				}
				for(int i=0;i<input.length();i++ ) {
					cnt ++;
					ch = input.charAt(i);
					if(ch=='(' || ch=='[') {
						st.push(ch);
					}else if(ch==')' || ch==']') {
						if(st.empty()) {
							// 1. �� ���ÿ��� pop�Ϸ��� ���
							sb.append("no\n");
							break;
							
						} else {
							peekCh = st.peek();
							// 2. �������� �ȸ´� ���
							if((ch ==')' && peekCh!='(' )||(ch==']' && peekCh!='[')) {
								sb.append("no\n");
								break;
							}
							st.pop();
						}
					}
				}
				if(cnt == input.length() && st.empty()) {
					sb.append("yes\n");
				} else if(cnt == input.length() && !st.empty()) {
					sb.append("no\n");
				}
				cnt = 0;
				st.clear();
				
				
				
			}
			



		
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
