// 3개의 난수 발생 => 1 ~ 100 => 최대값, 최소값
// 제어문 => 단일 조건문
public class 제어문_조건문_연습_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		int num3=(int)(Math.random()*100)+1;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("num3="+num3);
		
		int max=num1;
			if(max<num2) {
				max=num2;
			}
			if(max<num3) {
				max=num3;
			}
		System.out.println("max="+max); 
		
		int min=num1;
			if(min>num2) {
				min=num2;
			}
			if(min>num3) {
				min=num3;
			}
		System.out.println("min="+min);
	}

}
