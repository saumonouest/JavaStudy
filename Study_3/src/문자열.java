import java.util.Scanner;

import javax.swing.JOptionPane;
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name="ABCDabcd서연우";
		System.out.println("문자갯수:"+name.length());
		System.out.println("소문자 변환:"+name.toLowerCase());
		System.out.println("대문자 변환:"+name.toUpperCase());
		System.out.println("문자 추출: 6번째: "+name.charAt(5));
		System.out.println("성: "+name.substring(8,9));
		System.out.println("이름: "+name.substring(9,11));
		System.out.println("풀네임: "+name.substring(8));*/
		
		String myID="seoeonu";
		String myPW="1234";
		JOptionPane.showInputDialog("ID 입력: ");
		if(myID=="seoeonu") {
			JOptionPane.showMessageDialog(null,"ID 확인");
			JOptionPane.showInputDialog("PW 입력: ");
		}
		else {
			JOptionPane.showMessageDialog(null,"ID 오류");
		}
		if(myPW!="1234") {
			JOptionPane.showMessageDialog(null,"PW 오류");
		}
		else {
			JOptionPane.showMessageDialog(null,myID+"님 로그인 되었습니다");
			}
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("ID 입력:");
		String ID=scan.next();
		System.out.println("비밀번호 입력:");
		String PW=scan.next();
		
		if(ID.equals(myID) && PW.equals(myPW)) {
			System.out.println(ID+"님 로그인 되었습니다");
		}
		else { 
			System.out.println("ID 혹은 PW 오류");
		}*/
	}

}
/*	***startsWith : 문자열이 지정한 문자로 시작하는지 판단, 같으면 true 반환 아니면 false를 반환(대소문자 구별)
 * 	endsWith : 문자열 마지막에 지정한 문자가 있는 지를 판단 후 있으면 true, 없으면 false 반환
 *	***equals : 두 개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환(대소비교)
 *	***indexOf : 지정한 문자가 문자열에 몇 변째에 있는지를 반환
 *	***lastindexOf : 문자열에 지정한 문자가 마지막 몇 번째에 있는 int를 반환
 *	***length : 문자열의 길이를 반환
 *	replace : 문자열에 지정한 문자가 "" 가 있으면 새로 지정한 문자 ""로 바꿔서 출력
 *	replaceAll : 정규표현식을 지정한 문자로 바꿔서 출력 [가-힣]
 *	split : 지정한 문자로 문자열을 나눌 수 있음(배열로 반환)
 *	***substring : 문자열에 지정한 범위에 속하는 문자열을 반환(시작범위 값 포함, 끝나는 범위 값 불포함)
 *	toUpperCase : 문자열에 소문자를 대문자로 변환
 *	toLowerCase : 문자열에 대문자를 소문자로 변환
 *	trim : 문자열에 공백을 제거
 *	toString() : 지정한 개체의 원시 값을 변환
 *	***Contains : 두 개의 String을 비교, 비교대사 String을 포함하고 있으면 true, 다르면 false
 *	charAt : 지정한 index번째에 문자를 반환
 * 
 */
