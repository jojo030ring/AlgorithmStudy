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
		
			// 1. 스택이 잘 빠져나온 경우. : 끝까지 순회했고(cnt), 스택도 비어있는 경우
			// 2. 스택이 잘 빠져나오지 못한 경우 : 1_빈 스택에서 pop하려는 경우
			// 									   2_순서 쌍이 안맞는 경우
			//								       3_다 순회했는데도 스택이 안비어있는 경우
			
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
							// 1. 빈 스택에서 pop하려는 경우
							sb.append("no\n");
							break;
							
						} else {
							peekCh = st.peek();
							// 2. 순서쌍이 안맞는 경우
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
