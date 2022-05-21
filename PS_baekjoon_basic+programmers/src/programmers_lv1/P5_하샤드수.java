package programmers_lv1;

public class P5_�ϻ���� {
	public static void main(String[] args) {
		System.out.print(P5_�ϻ����.solution2(12));
	}
	
	// https://www.delftstack.com/ko/howto/java/how-to-get-the-separate-digits-of-an-int-number/
	// �־��� �������� ���ڿ� �и��ϱ� 
	public static boolean solution(int x) {
		int sum = 0;
		String tmpArg = x+"";
		for(int i=0;i<tmpArg.length();i++) {
			sum += tmpArg.charAt(i)-'0';
		}
	
		return (x%sum == 0) ? true : false;
	}
//	�ڸ����� �� ���ϱ� ������ �������ϴ�.
	public static boolean solution2(int x) {
		int sum =0;
		int tmpArg = x;
		while(tmpArg>0) {
			sum += tmpArg%10;	// 10���� ���� �������� ���� > ���� �ڸ����� �����
			tmpArg /=10;		// ���� �ڸ��� ������ �����Ƿ� ���� �ڸ��� �������ش�. 10���� �����ش�.
		}
		
		return (x%sum == 0) ? true : false;
	}
}
