package ch1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P2490 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input  = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int[] dice = new int[6]; // �ֻ��� ���� �ֻ��� ���� ���� Ƚ���� �����ϴ� dice
		// ��ū�� �߶� ������
		while(st.hasMoreElements()) {
			int index = getInteger(st.nextToken())-1;	// �ε����� ���� �ֻ����� ��
			dice[index] ++;	// ���� �ֻ��� Ƚ��
			
		}
		// ��ȸ�ϸ鼭 ã�� 
		int cnt = 0; // �ֻ����� ���� ���� ��
		int maxCnt = 0; // �ֻ����� ���� ���� ���� �ִ밪
		int sameValue = 0; // ���� ���� ���Դٸ�, �� ��
		int maxValue = 0; // ���� ū ��
		for(int i = 0; i<dice.length;i++ ) {
			cnt = dice[i];
			if(cnt > maxCnt) { 
				maxCnt = cnt;
			}
			if(dice[i] >=2) { // �ߺ������� ���� �� ���� - 1,2��° ����
				sameValue = i+1; // �ε��� �� -> �ֻ��� ���� ��
			} 
			if(((i+1)>maxValue) && dice[i]>0) { // �� ��° ����(�ߺ� ����)�� ���õ� if��
												// �� ���̶� ���� �� �ִµ� ���� ���� ū �� �޾ƿ�
				maxValue = i+1;
			}
		}
		if(maxCnt == 1) {
			System.out.println(maxValue*100);
		} else if(maxCnt == 2) {
			System.out.println(1000+(sameValue)*100);
		} else if(maxCnt == 3) {
			System.out.println((10000+(sameValue)*1000));
		}
		
	}
	static int getInteger(String str) {
		return Integer.parseInt(str);
	}
	
	/**
	 * ó�� �����ߴ� �� : HashSet
	 * �ȵƴ� ���� : �ߺ��Ǵ� ���� ã�ƾ��ϴµ�
	 * 1���̳� 3�� ���ǰ��� ���� ����������
	 * 2�������� ��� ���ڰ� 2���� ���´�. �� ���� � ���� 
	 * �ߺ��Ǵ� ������ �˱� ���� X
	 * 
	 */
}
