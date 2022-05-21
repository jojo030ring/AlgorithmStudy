package programmers_lv1;

public class P5_하샤드수 {
	public static void main(String[] args) {
		System.out.print(P5_하샤드수.solution2(12));
	}
	
	// https://www.delftstack.com/ko/howto/java/how-to-get-the-separate-digits-of-an-int-number/
	// 주어진 정수에서 문자열 분리하기 
	public static boolean solution(int x) {
		int sum = 0;
		String tmpArg = x+"";
		for(int i=0;i<tmpArg.length();i++) {
			sum += tmpArg.charAt(i)-'0';
		}
	
		return (x%sum == 0) ? true : false;
	}
//	자릿수의 합 구하기 문제로 쓰였습니다.
	public static boolean solution2(int x) {
		int sum =0;
		int tmpArg = x;
		while(tmpArg>0) {
			sum += tmpArg%10;	// 10으로 나눈 나머지를 추출 > 일의 자리부터 추출됨
			tmpArg /=10;		// 일의 자리를 마무리 했으므로 일의 자리를 제거해준다. 10으로 나눠준다.
		}
		
		return (x%sum == 0) ? true : false;
	}
}
