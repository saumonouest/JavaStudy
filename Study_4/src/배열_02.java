
public class 배열_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=(int)(Math.random()*100)+1;
        int a2=(int)(Math.random()*100)+1;
        int a3=(int)(Math.random()*100)+1;
        int a4=(int)(Math.random()*100)+1;
        int a5=(int)(Math.random()*100)+1;
        
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);
        System.out.printf("평균:%.2f\n",(a1+a2+a3+a4+a5)/5.0);
        
        //배열
        int [] arr=new int[5]; //new를 이용하면 자동으로 0값 초기화
        for(int i=0;i<5;i++) {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        //출력 => 향상된 for문 => for-each => 데이터 출력 => 배열, 컬랙션에만 사용이 가능
        // 값 추가, 수정 . . 불가능 => 출력만 담당 => 데이터가 모아져 있어야 사용이 가능
        for(int i:arr) {
        	System.out.println(i+" ");
        }
	}

}
/*	new를 이용해 메모리 할당
 * 	=> 자동 초기화
 * 	int => 0
 *	double => 0.0
 *	long => 0L
 *	float => 0.0F
 *	boolean => false
 *	char => '\0'
 *	String => null
 *
 *	배열, 클래스
 *	---------
 *	int [] arr=new int[5]
 *		new => 요청한 메모리를 생성 => 생성된 위치의 주소값을 배열변수에 넘겨준다
 *		스택			  힙
 *
 *	int[] arr=new int[3]
 *	=> arr[0] arr[1] arr[2]
 *	
 *	int a,b,c;
 *	a=100
 *	b=200
 *	c=300
 *
 *	arr[0]=100
 *	arr[1]=200
 *	arr[2]=300
 *
 *
 *	for-each : 
 *	int [] arr
 *	double [] arr
 *	char [] arr
 *	for(데이터형 변수 : 배열명)
 *		int
 *		double
 *		char
 *		배열에 저장된 실제 데이터값을 읽어옴
 *
 *	(e.g.)
 *		int [] arr = {10,20,30,40,50}
 *		--- 데이터형 일치 => 배열명
 *		for(int i:arr)
 *			i=10
 *			i=20
 *			i=30
 *			i=40
 *			i=50 => for 종료
 *
 *		char[] arr={'A','B','C'}
 *		=> 가능 : 데이터형 크면 가능
 *		for(char c:arr)
 *			c='A'
 *			c='B'
 *			c='C' ==> 종료
 *
 *		=> 사용 => 출력과 관련(브라우저에서 목록)
 *
 *		char[] arr={'A','B','C'}
 *		for((char)int i:arr)
 *
 *		byte < char < int < long < float < double
 *		=> 형변환은 사용할 수 없다
 *
 *		(double)int a;(X)
 *		int a=(int)10.5
 *
 * 
 * 
 * 
 */
