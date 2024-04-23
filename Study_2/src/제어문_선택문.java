// 다중 조건문을 단순화 : switch ~ case, break(처리 후 종료)/default(case에 없는 데이터 처리)를 같이 사용
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보
		int com=(int)(Math.random()*3); // 0, 1, 2
		switch(com) {
		case 0:
			System.out.println("가위");
			break;
			
		case 1:
			System.out.println("바위");
			break;
			
		case 2:
			System.out.println("보");
			break;
		}

	}

}
