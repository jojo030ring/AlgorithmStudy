package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1_ū���ǹ�Ģ {
	public static void main(String[] args) throws Exception {
		/**
		 * ū ���� ��Ģ 
		 * : �迭�� ���� �� �־��� ���� M�� ���Ͽ� ���� ū ���� ����� ��
		 * Ư���� �ε����� �ش��ϴ� ���� �����ؼ� K���� �ʰ��� �� ����.
		 * ex) 2,4,5,4,6 
		 * M=8 / K=3
		 * Ư���� �ε����� ���� �����ؼ� 3�������� ������ �� ����.
		 * ū ���� ��Ģ�� ���� 6+6+6+5+6+6+6+5 > 46
		 * 
		 * 3,4,3,4,3���� �̷���� �迭�� ���� �� M=7, K=2
		 * �� ��° �ش��ϴ� 4�� �� ��° ���ҿ� �ش��ϴ� 4�� ������ �� ���� ���ϴ°� �����ϴ�.
		 * 4+4+4+4+4+4+4 = 28
		 * 
		 * �迭�� ũ�� N, ���ڰ� �������� Ƚ�� M, K�� �־��� �� ū ���� ��Ģ�� ���� ����� ���
		 * 
		 * �Է� : ù °�ٿ� N M K�� �־�����, �� ���� �������� ���еȴ�
		 * K : 1<=K<=10000 / N : 2<= N <=1000
		 * �� °�ٿ� �ڿ��� N���� �־�����. �� �ڿ��� ���� �������� ����. ������ �ڿ����� 1�̻� 10000������ ���� �־���.
		 * �Է����� �־����� K�� �׻� M���� �۰ų� ����.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = getIntegerValue(st.nextToken());
		int m = getIntegerValue(st.nextToken());
		int k = getIntegerValue(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		// �ʱ�ȭ
		for(int i=0;i<n;i++) {
			arr[i] = getIntegerValue(st.nextToken());
		}
		
		Arrays.sort(arr);
		int sum = 0;
		int max = arr[n-1]; // ���� ū ��
		int secondMax = arr[n-2]; // �� ��°�� ū ��
		// ������ ���ϸ� �ȴ�.
		int i=0;
		while(i<m) {
			for(int j=0;j<k;j++) {
				i++; 
				sum += max;
			}
			sum += secondMax;
			i++;
			
		}
		
		bw.write(sum+"");
		br.close();
		bw.close();
	}
	private static int getIntegerValue(String input) {
		return Integer.parseInt(input);
	}
} // M�� 10000���Ͽ��� �̷� ������� �ذ��� ����������, 
 // M�� 10000�̻��̸� �ð��ʰ��� �� ��.
 
