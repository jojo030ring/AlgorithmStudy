package programmers_lv1;

public class P8_�ִ������ּҰ���� {
	public static void main(String[] args) {
		solution(1,1000000);
	}
    public static long[] solution(long n, long m) {
        long[] answer = new long[2];
        long gcd = 1;
        long lcm = 1;
        long min = Math.min(n, m);
        
        // �ִ� ����� 
        for(long i=min;i>=1;i=i-min) {
        	if(n%i == 0 && m%i ==0) {
        		gcd = i;
        		break;
        	}
        }
        
        // �ּ� �����
        // lcm = m*n�� gcd�� ���� ��
        lcm = (n*m)/gcd;
        answer[0] = gcd;
        answer[1] = lcm;
        System.out.println(gcd+"/"+lcm);
        return answer;
        
    }
    
    // ��Ŭ���� ȣ���� �̿�
    public static long[] solution2(long n, long m) {
    	long gcd_num = gcd(n,m);
    	long lcm_num = n*m/gcd(n,m);
        long[] answer = new long[2];
        answer[0] = gcd_num;
        answer[1] = lcm_num;
        
        return answer;
    	
    }
    public static long gcd(long num1, long num2) {
    	if(num2 == 0) return num1;
    	else return gcd(num2, num1%num2);
    }
}
