
public class 연산자_이항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수>=60 , 짝수 = true
		int score=(int)(Math.random()*100)+1; // 1 ~ 100 사이 난수 발생
		System.out.println("난수값="+score);
		boolean bCheck=(score>=60 && score%2==0); // 짝수 조건 %2==0
		System.out.println(bCheck);
//--------------------------------------------------------------------
		
		
	}

}
/* 1. 산술 연산자 : +(숫자 혹은 문자), -, *, /, % : 같은 데이터형끼리만 연산가능
 * 2. 비교 연산자 : ==, !=, <, <=, >, >= : 결과값이 true / false
 * 				> 조건문에서 사용된다 (if ~ else, boolean 등)
 * 3. 논리 연산자 : &&(직렬) / ||(병렬)
 * 				> && 조건은 false 하나만 있어도 false
 * 				> || 조건은 true 하나만 있어도 true
 * 4. 대입 연산자 : 메모리에 저장 : +=, -= 등
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ***임의의 수 추출 
 * Random r=new Random();
 * > num1 r.nextInt(101); = 0~100까지의 정수 추출 => 마지막 제외
 */
