//문자열을 거꾸로 출력하는 메소드를 구현하시오
// 매개변수 o, 리턴형 ?
import java.util.Scanner;
public class 문제_07 {
	static void rev(String str) {
		for(int i=str.length()-1;i>=0;i--){ // 거꾸로 출력이라
			System.out.println(str.charAt(i));
		}
		System.out.println();
		System.out.println(new StringBuffer(str).reverse());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String str=scan.next();
		rev(str);
	}

}
 