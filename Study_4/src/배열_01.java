import java.util.Scanner;
public class 배열_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;
		char score1,score2,score3;
		
		//점수 입력
		System.out.println("첫번째 학생의 국어 점수:");
		kor1=scan.nextInt();
		
		System.out.println("첫번째 학생의 영어 점수:");
		eng1=scan.nextInt();
		
		System.out.println("첫번째 학생의 수학 점수:");
		math1=scan.nextInt();
		
		System.out.println("두번째 학생의 국어 점수:");
		kor2=scan.nextInt();
		
		System.out.println("두번째 학생의 영어 점수:");
		eng2=scan.nextInt();
		
		System.out.println("두번째 학생의 수학 점수:");
		math2=scan.nextInt();
		
		System.out.println("세번째 학생의 국어 점수:");
		kor3=scan.nextInt();
		
		System.out.println("세번째 학생의 영어 점수:");
		eng3=scan.nextInt();
		
		System.out.println("세번째 학생의 수학 점수:");
		math3=scan.nextInt();
		
		//총점
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		
		//평균
		avg1=total1/3.0;
		avg2=total2/3.0;
		avg3=total3/3.0;
		
		//학점
		switch(total1/30) {
		case 10: case 9:
			score1='A';
			break;
			
		case 8:
			score1='B';
			break;
			
		case 7:
			score1='C';
			break;
			
		case 6:
			score1='D';
			break;
			
			default:
				score1='F';
		}
		switch(total1/30) {
		case 10: case 9:
			score2='A';
			break;
			
		case 8:
			score2='B';
			break;
			
		case 7:
			score2='C';
			break;
			
		case 6:
			score2='D';
			break;
			
			default:
				score2='F';
		}
		switch(total1/30) {
		case 10: case 9:
			score3='A';
			break;
			
		case 8:
			score3='B';
			break;
			
		case 7:
			score3='C';
			break;
			
		case 6:
			score3='D';
			break;
			
			default:
				score3='F';
		}
		//결과값 출력
		/*
		 *	%-5d	%5d => 간격 조절
		 *	----	---
		 *	00000	00000
		 *			   90
		 *	90---90---90---
		 */
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
						kor1,eng1,math1,total1,avg1,score1);
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
						kor2,eng2,math2,total2,avg2,score2);
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
						kor3,eng3,math3,total3,avg3,score3);
	}

}
/*	변수 : 한 개 저장
 * 	배열 / 클래스 : 여러개 저장
 *	배열 (4장)
 *		=> 1차원 배열
 *		=> 같은 데이터 여러개 모아서 관리(한 개 이름으로 처리)
 *		=> 장점 : 변수 여러개를 한 개의 이름으로 제어 > 반복문 사용이 편리
 *				 연속적 메모리 공간을 만든다
 *		=> 단점 : 고정적이다 => 추가, 삭제하기 어려움 (큰 배열, 작은 배열)
 *				 같은 데이터형만 모아서 관리
 *				 => 보완(가변형, 다른 데이터형을 모아서 관리 > **컬렉션(12장)
 *
 *	클래스 (5장)
 *		=> 같은 데이터 여러개 모아서 관리(한 개 이름으로 처리)
 *
 *	변수 / 연산자 / 제어문 => 기본 문법
 *	------------------ 모아서 관리
 *
 *	변수 => 100개 a1 ~ a100 => 최대값, 최소값
 *			if => 99
 *
 *	변수 / 배열 / 클래스 => 메모리에 저장 : RAM 프로그램 종료시 삭제
 *
 *	int a,b,c,d,e,f,g;
 *	int[] arr=new int[7];
 *	----- ---	  ------ 저장하는 갯수
 *  데이터형 배열명
 *  double d1,d2,d3. . .
 *  double[] arr=new double[갯수]
 *
 *
 * 
 * 
 * 
 * 
 * 
 */

