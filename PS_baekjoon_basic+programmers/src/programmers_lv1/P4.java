package programmers_lv1;
// �ڵ��� ��ȣ ������
public class P4 {
	public static void main(String[] args) {
		System.out.println(P4.solution("01033334444"));
		// *******4444��� ������
	}
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();
        for(int i=0;i<length-4;i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(length-4));
        return sb.toString();
    }
}
