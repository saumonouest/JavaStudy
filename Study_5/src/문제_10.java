//두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
// 매개변수 o, 리턴형 o
import java.util.Scanner;
public class 문제_10 {
	static int big (int a, int b) {
		int big=0;
		if(a>b)
			big =a;
		else if(a<b)
			big=b;
		return big;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력 :");
		int a=scan.nextInt();
		System.out.println("두번째 정수 입력 :");
		int b=scan.nextInt();
		System.out.println(big(a,b));
		
	}

}
