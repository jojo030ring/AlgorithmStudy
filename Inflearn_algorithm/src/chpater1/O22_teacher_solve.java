package chpater1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class O22_teacher_solve {
	public static void main(String[] args) {
		int n, k, i, sum = 0, max=0, res;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(sc.nextLine()," ");
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		for(i=0;i<k;i++) {
			sum+=arr.get(i); // 첫 구간의 합
		}
		
		max = sum;
		// 두 번째 구간의 합 부터....
		for(i = k;i<n;i++) {
			// sum에서 이전 구간의 합의 맨 첫번째 값을 빼주고, 현재 값을 더해준다. 
			sum += arr.get(i)-arr.get(i-k);
			if(sum > max) max = sum;
		}
		System.out.println(max);
		
	}
}
