// 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
// 매개변수 o, 리턴형 o
import java.util.Scanner;
public class 문제_06 {
	static void mir (String str) {
		
			if(str.length()%2!=0) {
				System.out.println("입력 오류");
				return;  // 메소드 종료 
			}
	
		boolean bCheck=true;
		for(int i=0;i<str.length()/2;i++) {
			char c1=str.charAt(i);
			char c2=str.charAt(str.length()-1-i); // i는 뒤에서부터 순서를 빼는 거임!, -1은 0부터 시작하니까 빼는 거고
			if(c1!=c2) {
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
			System.out.println("좌우 대칭");
		else
			System.out.println("좌우 비대칭");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String str=scan.next();
		mir(str);
		
	}

}
