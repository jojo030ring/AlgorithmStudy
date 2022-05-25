package chpater1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class O20_rockssisorpaper {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int [] arrA = new int[n];
		int [] arrB = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		initArray(st,arrA);
		st = new StringTokenizer(br.readLine()," ");
		initArray(st,arrB);
		
		for(int i =0; i<n ;i++) {
			
			// A�� B�� ���� ���
			if(arrA[i] == arrB[i]) {
				bw.write("D\n");
				
			// A�� �̱�� ���
			}else if(arrA[i]==1 && arrB[i]==3) {
				bw.write("A\n");
				
			}else if(arrA[i]==2 && arrB[i]==1) {
				bw.write("A\n");
			}else if(arrA[i]==3 && arrB[i]==2) {
				bw.write("A\n");
				
			}
			// A�� B�� ���� ��� + A�� �̱�� ��츦 �� �������� B�� �̱�� ���
			else {
				bw.write("B\n");
			}
			
		}// for
		
		
		
	}

	private static void initArray(StringTokenizer st, int[] arr) {
		// TODO Auto-generated method stub
		int idx = 0;
		while(st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx ++;
		}
	}
}
