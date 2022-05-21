package chapter4;

public class Array1 {
	public static void main(String[] args) {
		int [] arr = new int[]{10,50,40,30,70,20,0,0,0};
		Number_arr num = new Number_arr(6);
		insert (3,60,arr,num);
		printArr(arr,num);
		erase (4,arr,num);
		printArr(arr,num);
		
	}
	
	public static void insert(int index, int num , int arr[], Number_arr len ) {
		for(int i=len.length;i>index;i-- ) {
			arr[i] = arr[i-1];	// 끝에서부터 당겨와야 함
		}
		arr[index] = num;
		len.length++;
		
		
	}
	
	public static void erase(int index, int arr[], Number_arr len) {
		for(int i=index;i<len.length-1;i++) {
			arr[i] = arr[i+1];	// 앞으로 당겨와야 함.
		}
		len.length --;
	}
	
	public static void printArr(int arr[], Number_arr len ) {
		for(int i=0; i<len.length;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
	}
	
	
}
class Number_arr {
	int length = 0;
	Number_arr(int n) {
		this.length = n;
	}
}