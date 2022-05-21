package programmers_lv1;
import java.util.*;
public class P7_�ݶ������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextLong()));
		
	}
	
	public static long solution(long num) {
		if(num == 1) {
			return 0;
		}
		long answer = 0;
		boolean isEven = (num%2 == 0);
		
		for(long i=0;i<500;i++) { // 500�� �̻� �ݺ����� ���� �ȳ����� -1��ȯ
			answer = (i+1);
			isEven = (num%2==0);
			if(isEven) {
				num = num/2;
				if(num==1)
					return answer;
			} else {
				num = (3*num) + 1;
				if(num == 1)
					return answer;
			}
		}
		answer = -1;
		return answer;
	}
}
