package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2_����ī����� {
	/**
	 * ���� ���� ���� ī�� �߿��� ���� ���� ���ڰ� ���� ī�� �� ���� �̴� ����.
	 * <������ ��>
	 * 1. ī�� : NxM�� ���·� ��������. N : �� / M : ��
	 * 2. �̰��� �ϴ� ī�尡 ���Ե� �� ����
	 * 3. ���õ� �࿡ ���Ե� ī��� �� ���� ���ڰ� ���� ���� ����
	 * 4. ���� �ش� �࿡�� ���� ���ڰ� ���� ī�带 ���� ���� ���, ���������� ���� ���� ������ ī�带 ���� �� �ֵ��� �ؾ���.
	 * 
	 * 3 1 2
	 * 4 1 4
	 * 2 2 2
	 * 
	 * 1��° �� : 1
	 * 2��° �� : 1
	 * 3��° �� : 2
	 * 3��° ���� �̾ƾ� �Ѵ�.
	 * 
	 * �Է� : ���� ���� N ���� ���� M ���� �������� �Ͽ� ����
	 * ��° �ٺ��� N���� �ٿ� ���� ī�忡 ���� ���� �־���.
	 * 
	 * 3 3
	 * 3 1 2
	 * 4 1 4
	 * 2 2 2
	 * 
	 * 2 4
	 * 7 3 1 8
	 * 3 3 3 4
	 */
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		// �ʱ�ȭ ����
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// �ּҰ��� �����ϴ� ArrayList minList
		ArrayList<Integer> minList = new ArrayList<Integer>();
		// �Է��� 1���� 10000�������� ����� ū ���� �������־���.
		int min = 10001;
		// arr�� ��ȸ�ϸ� min���� ã�´�.
		for(int i=0;i<n;i++) {
			// i�� ���� �ּҰ��� ã�� ����
			for(int j=0;j<m;j++) {
				if(arr[i][j] <min) {
					min = arr[i][j];
				}
			}
			// for���� ���������� ���� i���� ���� �ּҰ��� ������ ����
			minList.add(min);
		}
		// sorting > ��������
		Collections.sort(minList);
		bw.write(minList.size()-1+"");
		bw.close();
		br.close();
		
		
		
		
	}
	
	
	
	
}
