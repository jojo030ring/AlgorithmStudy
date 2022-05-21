package ch7_deque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P1021_���� {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// �Էºκ�
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>(); // ������ �������� ����Ʈ
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
			// deque�ȿ� �ִ� ���� ��ü�� �ε���, �� �ʱ���¿����� �ε���
			while(dq.getFirst()!=target_idx) {
				// �ε����� �ε����� �����Ѵ�. �� ��Ұ� �� ������ �� ������ �ε����� �˻��Ͽ� �Ű��ش�.
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
