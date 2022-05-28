package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1_ū���ǹ�Ģ_������ {
	public static void main(String[] args) throws Exception {
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
		
		/**
		 * m = 5
		 * k = 3
		 * 
		 * 5/4 = 1 (������ ����)
		 * 5%4 = 1 (���� ����)
		 * 
		 */
		int remainderCount = m %(k+1);
		int count = m/(k+1) * k + remainderCount; 
		// k == 3�� �� totalRecursive���� max�� 3(m/(k+1))�� ��
		// remainderCount���� m%(k+1)�� ��.
		
		// ���� ū �� ���
		sum += count * max;
		// ���� �� ��� >> m������ ū���� �������� Ƚ���� ���� ���� ���� ����
		sum += (m-count) * secondMax;
		
		bw.write(sum+"");
		br.close();
		bw.close();
	}
	private static int getIntegerValue(String input) {
		return Integer.parseInt(input);
	}
}
