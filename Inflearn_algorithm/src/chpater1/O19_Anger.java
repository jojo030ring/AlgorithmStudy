package chpater1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class O19_Anger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input," ");
		
		int arr[] = new int[100]; // �� ���� ���� �� ���� 100�� ����
		int maxIndex = arrInit(st,arr); // ��� maxIndex���� �޾ƿ�
		
		int makingAngerCount = 0;	// �г�������
		int count = 0;				// �ӽ�  ī��Ʈ
		int i, j;					// �ݺ�����
		for(i=0;i<=maxIndex;i++) {
			for(j=0;j<maxIndex;j++) {
				if(arr[i]>arr[j]) {
					count++;
				} 
			}
			if(count == maxIndex-i) { // �� �л� ��ġ - �ڱ� ��ġ �� ���� ������ �ڱ� �ں��� �� �� ���Ƴ����ִ°�
				makingAngerCount ++;
			}
			count = 0; // �ӽ�ī��Ʈ �ʱ�ȭ
				
		}
		System.out.println(makingAngerCount);
		
	}
	public static int arrInit(StringTokenizer st, int arr[]) {
		int index = 0;
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index ++;
		}
		Arrays.toString(arr);
		return index;
	}
}
