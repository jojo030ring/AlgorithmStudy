package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O21_teacher_solve {
	public static void main(String[] args) {
		int i=0;
		int lw = 0;
		int aScore = 0;
		int bScore= 0;
		int arrA[];
		int arrB[];
		
		StringTokenizer st;
		Scanner sc=new Scanner(System.in);
		st = new StringTokenizer(sc.nextLine(), " ");
		arrA = initArr(st);
		st = new StringTokenizer(sc.nextLine(), " ");
		arrB = initArr(st);
		
		for(i=0;i<10;i++) {
			if(arrA[i]>arrB[i]) {
				aScore +=3;
				lw = 1;
			} else if(arrA[i]<arrB[i]) {
				bScore +=3;
				lw = 2;
			} else {
				aScore +=1;
				bScore +=1;
			}
			
		}
		
		System.out.println(aScore+ " " +bScore);
		if(aScore == bScore) {
			if(lw == 0)
				System.out.print("D");
			else if(lw == 1) 
				System.out.print("A");
			else 
				System.out.print("B");
		} else if(aScore > bScore)
			System.out.print("A");
		else 
			System.out.print("B");
			
			
		
		
		
	}
	private static int[] initArr(StringTokenizer st) {
		int[] result = new int[10];
		for(int i=0;i<10;i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		return result;
	}
	
}
