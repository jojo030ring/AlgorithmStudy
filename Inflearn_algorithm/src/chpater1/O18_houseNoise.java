package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O18_houseNoise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine(); // n, m
		String input2 = sc.nextLine(); // N�ʰ� ������ �ǽð� ����ġ
		StringTokenizer st = new StringTokenizer(input1," ");
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken()); // �溸���� �︮�� Ư�� ��ġ
		int cnt = 0; // �˶� Ƚ��
		int maxAlramed = -1; // �ִ� �˶� Ƚ��
		st = new StringTokenizer(input2," ");
		int sound = 0; // ����ġ
		for (int i = 0 ;i<n ;i++) {
			sound = Integer.parseInt(st.nextToken());
			if(sound>m) // �Ҹ��� ���ġ���� ū ���
				cnt ++;
			else { // �Ҹ��� ���ġ���� ���� ���
				cnt = 0;
			}
			if(maxAlramed < cnt) { // ���� ��� ���� ����ġ�� �Ѱ� �Ǹ� maxAlramed�� ���� �ȵ��� ������
				// if���� ������ ���־�� �Ѵ�.
				maxAlramed = cnt;
			}
			
		}
		System.out.println(maxAlramed==0 ? "-1" : maxAlramed);
		
		
		
	}
}
