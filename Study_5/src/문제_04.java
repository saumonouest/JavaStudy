// 두 정수의 나눗셈 결과를 구하는 메소드를 구현(실수)
// 매개변수 o, 리턴형 ?
import java.util.Scanner;
public class 문제_04 {
	static double div(int a, int b) {
		double d=0.0;
		try {
			d = a/(double)b; // 정상 수행
		}
		catch(Exception e) {
			System.out.println("0으로 나눌 수 없음"); // 오류 발생
		}
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		double d=div(a,b);
		System.out.println("div="+d);
	}

}
