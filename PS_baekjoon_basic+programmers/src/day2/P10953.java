package day2;
import java.util.Scanner;
import java.util.StringTokenizer;
public class P10953 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.nextLine());
	
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<n;i++) {
		StringTokenizer st = new StringTokenizer(sc.nextLine(),",");
		// split보다 더 빠른 StringTokenizer를 사용하자.
		// 생성자 > StringTokenizer(String value, String token)
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		sb.append((a+b)+"\n");
	}
	System.out.println(sb.toString());
	sc.close();
	
}
}
