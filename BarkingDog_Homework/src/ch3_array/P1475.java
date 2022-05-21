package ch3_array;

import java.io.*;
public class P1475 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int[] arr = new int[10];
		// 0���� �� �ʱ�ȭ ��Ų ��
		// ���ư��鼭 �����ֱ�
		// 6�̶� 9 ó���� ���ָ� �Ǵµ�,
		// �ε����� ��� ������ 2�� ���� �� ������ �������� �� ��ŭ��
		// ������ �������� ������ �� + 1��ŭ�� ��Ʈ ������ �ʿ��ϴ�.
		int setNum = 0; // 6, 9 ������ ������ ���� 
		int replaceCanNum = 0; // 6�� 9�� ������ ���� ����
		// ��ȸ�ϸ鼭 �� �ڸ� ���� ���
		for(int i=0;i<input.length();i++) {
			int index = input.charAt(i)-'0';
			arr[index]++;
		}
		// arr�� ��ȸ�ϸ鼭 set ������ ����.
		for(int i=0;i<10;i++) {
			if(arr[i]>setNum && (i!= 6 && i!=9)) { // i�� 6�̰� 9�� ���� ���� �����ϱ�� ��
				setNum = arr[i];  // arr[i]�� setNum���� ũ�� setNum�� arr[i]�� �ִ´�.
			}
		}
		int tmp = arr[6] + arr[9]; // 6�� 9�� ��ü �����ϱ� ������ ���� ������ش�.
		replaceCanNum = (tmp%2 == 0) ?  tmp/2 : (tmp/2+1);
		// �������� ���� ���� 2�� ���� ��������, �������� �ִ� ���� 1�� �����־�� �Ѵ�.
		
		setNum = Math.max(setNum, replaceCanNum);
		// ���� ������ 9�� 6�� ������ setNum�� �ִ밪�� setNum�� �������ش�.
		bw.write(setNum+"");
		bw.close();
		br.close();
			
		
	}
	
	
}
