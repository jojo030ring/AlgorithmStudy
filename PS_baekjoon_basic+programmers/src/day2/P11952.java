package day2;
import java.io.*;
public class P11952 {
	// �� ���� �Է¹޾� ���� ���
	// �������� 0 0 �� ����
public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	String input = null;
	while(true) {
		input = br.readLine();
		String inputArr[] = input.split(" ");
		int a = Integer.parseInt(inputArr[0]);
		int b = Integer.parseInt(inputArr[1]);
		if(a == 0 && b == 0)
			break;
		bw.write(a+b+"\n");
	}
	bw.flush();
	bw.close();
	br.close();
}
	/**
	 * �� �׽�Ʈ ���̽����� ����ϴ� ���� �ƴ϶�
	 * �� �ް� �� ������ �츣�� ����ϴ� ��
	 * 0 0�� ������ �ʵ��� ������ �� �����ؾ��� ��
	 */
}
