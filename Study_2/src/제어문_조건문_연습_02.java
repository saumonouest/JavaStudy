//사칙연산 => 연산자를 잘못 입력한 경우 . . . 처리
import java.util.Scanner;
public class 제어문_조건문_연습_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		char op=' ';
		
		System.out.println("첫번째 정수 입력:");
		num1=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0);
		
		System.out.println("두번째 정수 입력:");
		num2=scan.nextInt();
		
		if(op=='+' || op=='-' || op=='*' || op=='/') {
			if(op=='+') 
				System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);
		
			if(op=='-') 
				System.out.printf("%d - %d = %d\n", num1,num2,num1-num2);
			
			if(op=='*') 
				System.out.printf("%d * %d = %d\n", num1,num2,num1*num2);
			
			if(op=='/') {
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다");
				else
					System.out.printf("%d / %d = %.2f\n", num1,num2,num1/(double)num2);
			}
		 }

		else {//연산자가 없는 경우
			System.out.println("연산자를 잘못 입력 하였습니다");
		}
	}

}
