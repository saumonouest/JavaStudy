//3의 배수를 판별하는 메소드를 구현하시오
//매개변수 x, 리턴형 o
public class 문제_12 {
	static int trois(int a) {
		if(a%3==0) {
			System.out.println("3의 배수");
		}
		else
			System.out.println("3의 배수 아님");
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trois(795);
	}

}
