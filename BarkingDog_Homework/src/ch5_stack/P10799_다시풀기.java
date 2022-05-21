package ch5_stack;
import java.util.*;
import java.io.*;
public class P10799_다시풀기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input; // 괄호와 레이저를 입력받는 변수
		char prev='0'; // 이전에 나왔던 문자를 기록하는 변수
		char target; // 현재의 문자를 기록하는 변수
		int cnt=0; // 철봉의 개수를 세는 변수
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
