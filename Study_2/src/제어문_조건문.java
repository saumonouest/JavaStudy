import java.util.Scanner;
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 개의 점수를 받는다 => 60점 이상 합격 / 60점 미만 불합격
		int score = (int) (Math.random() * 100) + 1;
		/*
		 * System.out.println("점수:"+score);
		 * 
		 * if(score>=60) { System.out.println("결과:합격"); } if(score<60) {
		 * System.out.println("결과:불합격"); }
		 * 
		 * System.out.println(score>=60?"합격":"불합격"); //위의 문장과 동일한 내용
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력:");
		int num=scan.nextInt();

		if(num%2==0) { // 짝수 조건 
			System.out.println(num+"는(은) 짝수입니다");
		}
		if(num%2==1) { //홀수 조건
			System.out.println(num+"는(은) 홀수입니다");
		}
		// if문 뒤에 ;를 붙이게 되면 찍은 문장이 전부 출력됨
		  
		}

}
/*
 * 제어문 
 * 1. 조건문 : 건너뛴다 / 실행 : 단일조건문 / 선택조건문 / 다중조건문 
 * 	1) 단일 조건문 : if(조건문){수행문장} 
 * 	2) 선택 조건문 : if(조건문){수행문장} else{수행문장} 
 * 	3) 다중 조건문 : if(조건문){수행문장} else if{수행문장} else{수행문장}<생략가능 
 * 	** 중첩 : if(조건문){if(조건문)} / if(조건 && 조건){수행문장}
 * 
 * 2. 반복문 : 여러개 반복 
 * 	1) for : 반복횟수가 지정된 경우 
 * 	2) while : 반복횟수가 없는 경우 
 * 	3) do ~ while :
 * 	반드시 한 번 이상 수행
 * 
 * 3. 선택문 : 필요한 부분 선택 
 * 	1) switch ~ case
 * 
 * 4. 반복제어문 : 반복에서 나간다 
 * 	1) break : 반복수행을 종료 
 * 	2) continue : 특정 부분을 제외
 */
