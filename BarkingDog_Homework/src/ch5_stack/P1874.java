package ch5_stack;
import java.util.*;
import java.io.*;
public class P1874 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int lastVal = 0; // 스택의 마지막 값을 저장하는 변수
		int arrIndex = 0; // 배열의 인덱스를 저장하는 변수
		int stackNum = 0; // 스택 원소를 나타내는 변수 (1~n)

		int[] arr = new int[n]; // 수열을 저장하는 배열
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());	// 수열을 한 줄씩 받아낸다.
		}
		while(arrIndex<n) { // 배열이 모두 순회할 때까지 돌게 된다.
			if(stackNum > n) { // 스택에 들어가는 수가 지정한 숫자보다 더 크게 된다는 것은
							   // 더이상 연산이 불가능하다는 것. 
				sb.delete(0,sb.length());
				sb.append("NO");
				break;
			}

			if(arr[arrIndex]==lastVal) { // 수열의 한 요소와 스택의 마지막 값이 일치할 때
				stack.pop(); // 스택에서 요소를 빼온 뒤
				arrIndex++; // 수열을 순회하는 인덱스를 증가시키고
				sb.append("-\n"); // - 스트링을 추가한다.
				if(stack.empty()) { // 만약 방금 pop으로 인해 스택이 비었다면
					lastVal = 0; // 마지막 참조값을 0으로 설정한다.
				} else  // 그렇지 않다면
					lastVal = stack.peek(); // peek()함수를 통해 마지막 값을 받아온다.
				
			} else if(arr[arrIndex]>lastVal) { // 순열의 한 요소가 lastVal보다 더 크다면, 그만큼 push를 해주어야 한다.
				stackNum ++;		// stack에 들어갈 숫자를 증가시키고
				stack.push(stackNum); // push 해준다.
				sb.append("+\n");  // + 스트링을 StringBuilder에 추가한다.
				lastVal = stack.peek(); // lastVal에 방금 추가한 stack을 넣어준다.
			} else { // lastVal이 순열의 한 요소보다 크다면,
				stack.pop(); // pop을 해주고 
				lastVal = stack.peek(); // 스택의 맨 위에 있는 값을 참조한다.
			}
			
			
		}
		if(arrIndex<n) { // 만약 스택에 값을 다 넣을 때까지 문제가 해결되지 않았다면(arrIndex가 끝까지 순회를 못한거임)
			sb.delete(0,sb.length()); 
			sb.append("NO");// 안된다고 표시
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
		
		
		
	}
}
