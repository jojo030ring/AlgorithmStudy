package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O23_���Ӻκ��������� {
	public static void main(String[] args) {
		StringTokenizer st;
		Scanner sc = new Scanner(System.in);
		st = new StringTokenizer(sc.nextLine(), " ");
		int max=-1000000; // ������ ������ max��
		int count = 0;   // ������ �̾����� ī��Ʈ ��
		int maxCount = 0; // �ִ� ī��Ʈ ��
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			// �����̶� �� �����Ҽ��� ���� Ŀ���ϱ�
			// ���� max������ Ǯ�
			if(max<=num) {
				count ++;
				max=num;
				if(count>maxCount)
					maxCount = count;
				
			} else {
				// ���� �ڸ����� �ٽ� ������ ���۵� ���� �־ count�� 1�� �ְ� ��
				count =1; // ���� �ڸ��� ù��° ���� �о���ΰŴ� count�� 0���� �ʱ�ȭ�ϸ� �ȵ�.
				max = num; // �̰� 0���� �ʱ�ȭ�ϸ� �� ��...
							// ���� �о�� ���� �ʱ�ȭ �ؾ���
				/**
				 * 10 3 1 2 3 4 
				 * 3 > count =1 / max = 0
				 * 1 > max<=1 => count=2 / max =1
				 * ī��Ʈ�� �� ���� ��. ���� 0���� �ʱ�ȭ���� ���ƾ���
				 */
				
			}
			
			
		}
		System.out.println(maxCount);
	}
}
