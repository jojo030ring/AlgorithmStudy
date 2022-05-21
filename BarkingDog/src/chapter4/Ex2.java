package chapter4;
/*
 * 	주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가
 * 존재하면 1, 존재하지 않으면 0을 반환하는 func2(int arr[], int n)을 
 * 작성하라.
 * 각 수는 0이상 100이하, N은 1000이하다.
 * 
 * func2({1,52,48},3) = 1
 * func2({50,42},2) = 0
 * func2({4,13,63,87},4) = 1
 * 
 * */
public class Ex2 {
	public static void main(String[] args) {
		System.out.println(func2(new int[] {4,13,63,87},4));
	}
	
	public static int func2(int[] arr, int n) {
		int [] check = new int[101];
		check[0] = 999;
		for(int i=0;i<arr.length;i++) {
			check[arr[i]]=1;
			if(check[100-arr[i]]!=0)
				return 1;
		}
		return 0;
		
	}
}
