//학점을 구하는 메소드를 구현하시오
// 매개변수 o, 리턴형 o
public class 문제_08 {
	static char grade(int score) {
		char c=' ';
		switch(score/10) {
		case 10:
		case 9:
			System.out.println('A');
			break;
			
		case 8:
			System.out.println('B');
			break;
			
		case 7:
			System.out.println('C');
			break;
			
		case 6:
			System.out.println('D');
			break;
			
		default:
			System.out.println('F');
			break;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=grade(98);
		System.out.println(c);
	}

}
