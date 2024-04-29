//입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
//매개변수 o, 리턴형 o
import java.util.Scanner;
public class 문제_11 {
	static String evenodd(int a) {
		String str="";
		if(a%2==0) {
			str="even";
		}
		else { 
			str="odd";
	
		}return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int a=scan.nextInt();
		System.out.println(evenodd(a));
		
	}

}
