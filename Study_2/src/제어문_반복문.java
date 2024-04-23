//for : 초기값;조건식;증가식
//for(;;) : 무한루프 : 자바에서 잘 안 씀
// continue : 특정부분 제외 / break : 반복문 중단

// 1 ~ 100 사이의 짝수의 합, 홀수의 합, 전체 합을 구하라
public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, even=0, odd=0; // 합
		int ecount=0, ocount=0; // 갯수
		
		// 초기값 부여
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				even+=i; // 짝수값 누적 => 복합 대입 연산자
				ecount++; // 갯수 확인 => 단항 연산자
			}
			else {
				odd+=i; // 홀수값 누적
				ocount++; //갯수 확인
			}
			sum+=i;
		}
		System.out.println("1~100 사이의 짝수 합:"+even);
		System.out.println("1~100 사이의 홀수 합:"+odd);
		System.out.println("1~100 사이의 짝수 갯수:"+ecount);
		System.out.println("1~100 사이의 짝수 갯수:"+ocount);
		System.out.println("1~100 사이의 총합:"+sum);
		
	}

}
