/*
 *   1)	100점 만점으로 성적을 입력 받아 
 *       90~100이면 A,80~89이면 B,
 *       70~79이면 C, 60~69이면 D, 
 *       60점 이하면 F를 출력하라 (switch~case 사용)
 */
import java.util.Scanner;
public class 제어문_선택문_연습_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0; //유효성 검사
		Scanner scan=new Scanner(System.in);
		
	while(true){	
		System.out.println("점수 입력:");
		num=scan.nextInt();
		if(num<0 || num>=100) {
			System.out.println("다시 입력하세요");
			continue;
		}
		break;
	}
		switch(num/10) {
		case 10: 
		case 9:
			System.out.println("A학점");
			break;
			
		case 8:
			System.out.println("B학점");
			break;
			
		case 7:
			System.out.println("C학점");
			break;
			
		case 6:
			System.out.println("D학점");
			break;
			
		default:
			System.out.println("F학점");
		}

	}

}
