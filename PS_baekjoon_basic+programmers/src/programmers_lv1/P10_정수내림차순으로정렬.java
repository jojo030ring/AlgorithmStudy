package programmers_lv1;
import java.util.*;
public class P10_정수내림차순으로정렬 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();
			Integer[] arr = new Integer[input.length()];
			// sort가 Integer 타입이기 때문에 Integer로 사용해주어야 한
			for(int i=0;i<arr.length;i++) {
				arr[i] = input.charAt(i)-'0';
			}
			Arrays.sort(arr, new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2-o1;
					}
			});
			
			long result = 0;
			for(int i = 0;i<=arr.length-1;i++) {
				result +=(long)(arr[i]* Math.pow(10,arr.length-1-i));
			}
			sc.close();
			System.out.println(result);
			
		}
}
