// 1~n 까지 합을 구하는 메소드를 구현
// 리턴형(o) 매개변수(o)
import java.util.Scanner;
public class 문제_03 {
	static int total(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 :");
		int n=scan.nextInt();
		int sum=total(n);
		System.out.println("sum="+sum);
	}

}
