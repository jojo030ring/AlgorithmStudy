package chapter2;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Integer> vv = new Vector(10);
		vv.add(0,19);
		func5(vv);
		System.out.println(vv.get(0));
	}
	
	public static int func1(int n) {
		int sum = 0;
		for(int i=0;i<=n;i++) {
			if(i%3==0||i%5==0)
				sum+=i;
		}
		
		return sum; // 시간 복잡도는 o(n)
	}
	
	public static boolean func2(int arr[], int n) {
		int target = 0;
		int item=0;
		for(int i=0;i<n;i++) {
			target=100-arr[i];
			for(int j=0;j<n;j++) {
				if(target==arr[j])
					return true;
			}
			
		}
		return false; // 최악 O(n^2)
	}
	public static boolean func3(int n) {
//		double sqrt = (Math.sqrt(n));
//		System.out.println(n%sqrt);
//		return (n%sqrt==0)? true : false;
		
		for(int i=1;i*i<=n;i++) {
			if(i*i==n) return true;
		}
		return false;
		
	} // O(N^(1/2))
	
	public static int func4(int n) {
		int max = 0;
		int mult = 1;
		// N이하의 자연수 중 가장 큰 2의 거듭제곱 수를 반환하는 함수
		for(int i=1;i*i<=n;i++) {
			mult *=2;
			if(mult<=n) {
				max=(max<mult)? mult : max;
			}
		}
		return max; // O(lgN)
	}
	public static void func5(Vector<Integer> v) {
		v.set(0, 123123);
		
	}
}


