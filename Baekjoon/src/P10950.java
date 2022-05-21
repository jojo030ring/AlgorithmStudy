import java.util.*;
public class P10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n;i++) {
			String[] input = sc.nextLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			System.out.println(a+b);
		}
		sc.close();
	}
}
