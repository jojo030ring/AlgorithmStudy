package programmers_lv1;

public class P6_Æò±Õ±¸ÇÏ±â {
	public static void main(String[] args) {
		System.out.println(P6_Æò±Õ±¸ÇÏ±â.solution(new int[]{1,2,3,4}));
	}
public static double solution(int[] arr) {
    int length = arr.length;
    int sum =0;
    for(int i : arr) {
    	sum += i;
    }
    
    return (double)sum/length;
}
}
