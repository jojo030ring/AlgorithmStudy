package chpater1;
import java.util.*;
public class O21_cardgame  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		int[] cardOfA=initArray(st);
		st=new StringTokenizer(sc.nextLine()," ");
		int[] cardOfB = initArray(st);
		
		int sumA = 0;
		int sumB = 0;
		// Ʋ�ȴ� ���� : �� ������ ���� ��쿣 ���� �������� �̱� ����� ������ ���ڷ� ��´�
		// + �ºΰ� ���� �ʴ� ���� ��� ���忡�� ���� ���� 
		// �ºθ� �������ִ� ���� lw�� �ʿ��ϴ�.
		
		int lw = 0;
		// A�� �̰����� 1
		// B�� �̰����� 2 ��� �����Ѵ�.
		for(int i=0;i<10;i++) {
			// ���� ������ ����
			if(cardOfA[i]==cardOfB[i]) {
				sumA+=1;
				sumB+=1;
				
			// A�� �̱�� ��� 
			}else if(cardOfA[i]>cardOfB[i]) {
				sumA+=3;
				lw = 1;
			// ������ ��� > B�� �̱�� ���
			}else {
				sumB+=3;
				lw = 2;
			}
		}
		System.out.println(sumA+" "+sumB);
		if(sumA==sumB) {
			// 1) �������� A�� �̱� ���
			if(lw == 1)
				System.out.print("A");
			// 2) �������� B�� �̱���
			else if(lw == 2)
				System.out.print("B");
			// 3) ��¥ ��ο��� ��� > lw == 0
			else System.out.print("D");
		}
			
		else if(sumA > sumB) 
			System.out.print("A");
		else 
			System.out.print("B");
		
		
		sc.close();
		
	}
	
	private static int[] initArray(StringTokenizer st) {
		int[] result = new int[10];
		for(int i=0;i<10;i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		return result;
	}
}
