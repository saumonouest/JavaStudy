
public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=80;
		int eng=98;
		int math=100;
		int total=(kor+eng+math);
		double avg=(total/3.0);
		
		System.out.println("국어점수="+kor);
		System.out.println("영어점수="+eng);
		System.out.println("수학점수="+math);
		System.out.println("총점="+total);
		System.out.printf("평균=%.2f",avg); //소수점 두자리만 출력, 뒤에 + 아니고 , 줘야함
	}

}
/* 자바 기본 문법
 * 1. 데이터 저장 : 변수 / 상수 / 배열 / 클래스
 * 2. 데이터 가공 : 연산자 /제어문 => 메소드
 * 3. 가공된 데이터 출력 : 명령 프롬포트 / 브라우저 / 핸드폰
 * 4. 데이터 분석 : 파이썬 / AWS (?)
 * 
 * 
 * 변수
 * 1. 메모리에 이름 설정
 * 2. 메모리 크기
 * 		1) 정수 : byte < int < long 
 * 		2) 실수 : float / double
 * 		3) 문자 : char 
 * 		4) 논리 : boolean
 * 		5) 참조형 : 배열 / 클래스 => 메모리 주소 이용
 * 
 * 연산처리
 * 1. 단항 연산자 : 연상 대상이 1개 
 * 		1) 증감 연산자 : 1개 증가 / 1개 감소 = ++, --
 * 		2) 부정 연산자 : true>false, false>true = !
 * 		3) 형변환 연산자 : 모든 데이터형 변경 가능(boolean 제외)
 * 
 * 2. 이항 연산자 : 연산 대상이 2개
 * 		1) 산술 연산자 : +, -, *, /, % (같은 데이터형끼리만 가능)
 * 		2) 비교 연산자 : ==, !=, >, <, >=, <=
 * 		3) 논리 연산자 : && / || 
 * 		4) 대입 연산자 : =, +=, -= 등
 * 
 * 3. 삼항 연산자 : 연산 대상이 3개 => if ~ else 
 * 				= (조건)?값1:값2 = 조건 : true > 값1, false > 값2
 * 		
 */
 