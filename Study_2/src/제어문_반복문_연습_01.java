/* 무한루프
 * 업다운 게임
 * 1~100 사이 숫자
 */
import java.util.Scanner;
public class 제어문_반복문_연습_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		int num=0;
		for(;;) {
			System.out.println("숫자를 입력하세요:");
			int user=scan.nextInt();
			if(user<1 || user>100) { // 범위를 벗어난 경우 ||
					System.out.println("입력값 오류");
					continue; // for의 처음으로 돌아감
			}
			num++;
			if(com>user) {
				System.out.println("UP");
			}
			else if(com<user) {
				System.out.println("DOWN");
			}
			else {
				System.out.println("정답입니다");
				break; // for 종료
			}
		}
		System.out.println(100-(num*5)+"점");
	}

}
