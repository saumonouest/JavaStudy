// 문자열의 소문자를 대문자로 바꾸는 메소드를 구현
// 매개변수 o, 리턴형 o
import java.util.Scanner;
public class 문제_05 {
	static String cap (String str) {
		String res="";
		for(int i=0;i<=str.length();i++) {
			char c=str.charAt(0);
			if(c>='A' && c<='Z') {
				res+=c;
			}
			else if(c>='a' && c<='z') {
				res+=(char)(c-32);
			}
			else {
				res+=c;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String str=scan.next();
		String res=str;
		System.out.println("res="+res);
		
	}

}
