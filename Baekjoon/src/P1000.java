import java.io.*;

public class P1000 {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        
        System.out.println(a+b);
        
        br.close();
        
    }

}
/**
 * 	import java.util.Scanner;
	public class Main {
    public static void main(String[] args){
        int sum = 0;
		String input = (new Scanner(System.in)).nextLine();

		for (String tmp : input.split(" ")) {
			sum+=Integer.parseInt(tmp);
		}
		
		System.out.println(sum);
        
    }
    
    
}
 * 
 */
