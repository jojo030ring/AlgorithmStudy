import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10828 {
public static void main(String[] args) throws Exception {
	/**
	 * 1. 입력을 받아야함
		2. split해서 명령어와 숫자를 분리해야함 > String[0]이 명령어. push인 경우만 1번 인덱스에 접근한다.
		3. switch문으로 어떻게 해보면 될듯
		4. 입력은 BufferedReader~로 연결해서 readLine으로 읽자
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
