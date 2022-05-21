package ch7_deque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P1021_도움 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력부분
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>(); // 순서를 저장해줄 리스트
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Deque<Integer> dq = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			dq.offerLast(i);
		}
		int count=0;
		for(int target_idx : arr) {
			// deque안에 있는 원소 자체가 인덱스, 단 초기상태에서의 인덱스
			while(dq.getFirst()!=target_idx) {
				// 인덱스의 인덱스를 생각한다. 한 요소가 맨 앞으로 올 때까지 인덱스를 검사하여 옮겨준다.
				if(((LinkedList<Integer>) dq).indexOf(target_idx)<=(dq.size()/2)) {
					dq.offerLast(dq.pollFirst());
					
				} else {
					dq.offerFirst(dq.pollLast());
				}
				count++;
			}
			if(dq.peekFirst()==target_idx) {
				dq.pollFirst();
			}
		}
			
		bw.write(count+"");
		bw.close();
		br.close();
		
		
	}
}
