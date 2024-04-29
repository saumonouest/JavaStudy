//년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
// 매개변수 o, 리턴형 ?
import java.util.Scanner;
public class 문제_13 {
	static void 요일(int year, int month, int day) {
		char date=' ';
		if(year%365==0 && month%12==0) {
		switch(day%7) {
		case 1: 
			date='월';
			break;
		case 2: 
			date='화';
			break;
		case 3: 
			date='수';
			break;
		case 4: 
			date='목';
			break;
		case 5: 
			date='금';
			break;
		case 6: 
			date='토';
			break;
		default:
			date='일';
			break;
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년 입력:");
		int year=scan.nextInt();
		System.out.println("월 입력:");
		int month=scan.nextInt();
		System.out.println("일 입력:");
		int day=scan.nextInt();
		요일(year,month,day);
		 
	}

}
