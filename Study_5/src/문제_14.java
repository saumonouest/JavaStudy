//메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 수를 출력하는 프로그램을 작성하세요
// 매개변수 o, 리턴형 o
import java.util.Scanner;
public class 문제_14 {
	static void chain(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		String str=scan.next();
		chain(str);
		
	}

}
