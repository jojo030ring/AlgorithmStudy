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
		
		String forLoop = multResult+""; // ��ȸ�ϱ� ���� ���ڿ��� �޾��־���..
		int length = forLoop.length(); // length�� �޾���
		int[] result = new int[10]; // 0���� 9����
		for(int i=0;i<length;i++) {
			result[forLoop.charAt(i)-'0']++;
		}
		
		for(int i:result) {
			bw.write(i+"\n");
		}
		bw.close();
		
	}
	// �Է��� ���� �޼��� getArray()
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
