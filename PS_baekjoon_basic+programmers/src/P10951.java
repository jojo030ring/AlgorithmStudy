import java.util.Scanner;

public class P10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) { // EOF Ã³¸®
			String[] input = sc.nextLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			System.out.println(a + b);
		}
		sc.close();
	}
}
