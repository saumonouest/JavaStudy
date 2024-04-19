
public class 연산자_단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++;
		a++;
		a++;
		System.out.println("a="+a);
		
		int b=10;
		b--;
		b--;
		b--;
		System.out.println("b="+b);
		
		int c=10;
		++c;
		++c;
		++c;
		System.out.println("c="+c);
		
		int d=10;
		d--;
		d--;
		d--;
		System.out.println("d="+d);
//-------------------------------------------------------증감 연산자
		boolean bCheck=false;
		while(true) {
			bCheck=!bCheck;
			if(bCheck==true) {
				System.out.println("컴퓨터");
			}
			else {
				System.out.println("본인");
			}
			
		}
//-------------------------------------------------------부정 연산자
		
	}

}
/* 단항 연산자
 * 1. 증감 연산자 : ++, -- : 1개 증가, 1개 감소
 * 	1) 전치 연산 : 선 증가 후 대입
 *  2) 후치 연산 : 선 대입 후 증가
 *  
 * 2. 부정 연산자 : (!) : boolean에서만 사용 가능 / 턴 게임에서 많이 사용
 * 
 * 3. 형변환 연산자 : Upcasting / DownCasting (boolean 제외)
 * 
 */
