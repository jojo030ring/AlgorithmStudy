package chpater1;
import java.util.Scanner;
import java.util.StringTokenizer;

public class O19_1_Anger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, cnt=0,max=-1;
		n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input," ");
		arrInit(st,arr);
		max = arr[n-1];
		for(i=n-1;i>=0;i--) {
			if(arr[i]>max) {
				max = arr[i];
				cnt ++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
	public static void arrInit(StringTokenizer st, int arr[]) {
		int index = 0;
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index ++;
		}
	}
}
