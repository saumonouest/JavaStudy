//년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
import java.util.Scanner;
public class 문제_09 {
	static boolean year(int y) {
		boolean bCheck=false;
		if((y%4==0 && y%100!=0) || (y%400==0))
			bCheck=true;
			
		else
			bCheck=false;
		return bCheck;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		boolean bCheck=year(2024);
		if(bCheck==true)
			System.out.println("윤년");
		else
			System.out.println("윤년이 아님");
	}

}
