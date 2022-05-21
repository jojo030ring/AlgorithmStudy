package day3;
import java.io.*;
public class P11721 {
public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	String input = br.readLine();
	for (int i = 0 ; i < input.length();i+=10) {
		if((i+10)> input.length()) {
			//같은 경우는 그냥 밑에서 추가해주면 됨
			bw.write(input.substring(i,input.length()));
			break;
		}
		bw.write(input.substring(i,i+10)+"\n");
	}
	bw.flush();
	br.close();
	bw.close();
}
}
