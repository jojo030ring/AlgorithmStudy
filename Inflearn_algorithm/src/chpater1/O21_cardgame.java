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
		// 틀렸던 이유 : 총 승점이 같은 경우엔 제일 마짐가에 이긴 사람을 게임의 승자로 삼는다
		// + 승부가 나지 않는 경운느 모든 라운드에서 비기는 경우다 
		// 승부를 저장해주는 변수 lw가 필요하다.
		
		int lw = 0;
		// A가 이겼으면 1
		// B가 이겼으면 2 라고 가정한다.
		for(int i=0;i<10;i++) {
			// 비기는 경우부터 생각
			if(cardOfA[i]==cardOfB[i]) {
				sumA+=1;
				sumB+=1;
				
			// A가 이기는 경우 
			}else if(cardOfA[i]>cardOfB[i]) {
				sumA+=3;
				lw = 1;
			// 나머지 경우 > B가 이기는 경우
			}else {
				sumB+=3;
				lw = 2;
			}
		}
		System.out.println(sumA+" "+sumB);
		if(sumA==sumB) {
			// 1) 마지막에 A가 이긴 경우
			if(lw == 1)
				System.out.print("A");
			// 2) 마지막에 B가 이긴경우
			else if(lw == 2)
				System.out.print("B");
			// 3) 진짜 드로우인 경우 > lw == 0
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
