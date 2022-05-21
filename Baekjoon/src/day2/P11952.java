package day2;
import java.io.*;
public class P11952 {
	// 두 정수 입력받아 합을 출력
	// 마지막엔 0 0 이 들어옴
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
	 * 각 테스트 케이스마다 출력하는 것이 아니라
	 * 다 받고 난 다음에 우르르 출력하는 것
	 * 0 0은 나오지 않도록 순서를 잘 조절해야할 것
	 */
}
