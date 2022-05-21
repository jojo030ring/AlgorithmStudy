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
		int lastVal = 0; // ������ ������ ���� �����ϴ� ����
		int arrIndex = 0; // �迭�� �ε����� �����ϴ� ����
		int stackNum = 0; // ���� ���Ҹ� ��Ÿ���� ���� (1~n)

		int[] arr = new int[n]; // ������ �����ϴ� �迭
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());	// ������ �� �پ� �޾Ƴ���.
		}
		while(arrIndex<n) { // �迭�� ��� ��ȸ�� ������ ���� �ȴ�.
			if(stackNum > n) { // ���ÿ� ���� ���� ������ ���ں��� �� ũ�� �ȴٴ� ����
							   // ���̻� ������ �Ұ����ϴٴ� ��. 
				sb.delete(0,sb.length());
				sb.append("NO");
				break;
			}

			if(arr[arrIndex]==lastVal) { // ������ �� ��ҿ� ������ ������ ���� ��ġ�� ��
				stack.pop(); // ���ÿ��� ��Ҹ� ���� ��
				arrIndex++; // ������ ��ȸ�ϴ� �ε����� ������Ű��
				sb.append("-\n"); // - ��Ʈ���� �߰��Ѵ�.
				if(stack.empty()) { // ���� ��� pop���� ���� ������ ����ٸ�
					lastVal = 0; // ������ �������� 0���� �����Ѵ�.
				} else  // �׷��� �ʴٸ�
					lastVal = stack.peek(); // peek()�Լ��� ���� ������ ���� �޾ƿ´�.
				
			} else if(arr[arrIndex]>lastVal) { // ������ �� ��Ұ� lastVal���� �� ũ�ٸ�, �׸�ŭ push�� ���־�� �Ѵ�.
				stackNum ++;		// stack�� �� ���ڸ� ������Ű��
				stack.push(stackNum); // push ���ش�.
				sb.append("+\n");  // + ��Ʈ���� StringBuilder�� �߰��Ѵ�.
				lastVal = stack.peek(); // lastVal�� ��� �߰��� stack�� �־��ش�.
			} else { // lastVal�� ������ �� ��Һ��� ũ�ٸ�,
				stack.pop(); // pop�� ���ְ� 
				lastVal = stack.peek(); // ������ �� ���� �ִ� ���� �����Ѵ�.
			}
			
			
		}
		if(arrIndex<n) { // ���� ���ÿ� ���� �� ���� ������ ������ �ذ���� �ʾҴٸ�(arrIndex�� ������ ��ȸ�� ���Ѱ���)
			sb.delete(0,sb.length()); 
			sb.append("NO");// �ȵȴٰ� ǥ��
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
		
		
		
	}
}
