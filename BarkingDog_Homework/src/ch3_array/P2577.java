package ch3_array;
import java.io.*;
public class P2577 {
	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] num = getArray();
		int multResult = 1;
		for(int i : num) {
			multResult *=i;
		}
		
		String forLoop = multResult+""; // 순회하기 쉽게 문자열로 받아주었음..
		int length = forLoop.length(); // length를 받아줌
		int[] result = new int[10]; // 0부터 9까지
		for(int i=0;i<length;i++) {
			result[forLoop.charAt(i)-'0']++;
		}
		
		for(int i:result) {
			bw.write(i+"\n");
		}
		bw.close();
		
	}
	// 입력을 위한 메서드 getArray()
	public static int[] getArray() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] result = new int[3];
		result[0]=Integer.parseInt(br.readLine());
		result[1]=Integer.parseInt(br.readLine());
		result[2]=Integer.parseInt(br.readLine());
		br.close();
		return result;
		
	}
}
