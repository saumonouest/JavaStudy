// 1~10까지의 합을 구하는 메소드를 구현
// 리턴형 (O) 매개변수(X)

public class 문제_02 {
	static int total() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(total());
	}

}
