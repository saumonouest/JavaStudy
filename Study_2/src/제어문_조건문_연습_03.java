/*
 * 9)Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
 *십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
 *
 */
import java.util.Scanner;
public class 제어문_조건문_연습_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("정수를 입력하세요:");
		int num=scan.nextInt();
		if (num>=10 && num<=99) {
			if(num%11==0) {
			System.out.println("1의 자리와 10의 자리가 같습니다");
			}
			else {
				System.out.println("1의 자리와 10의 자리가 다릅니다");
			}
		}
		else {
			System.out.println("잘못된 입력입니다");
			continue;
		}
		}
	}

}
