/*
 *   int[] num = { 94, 85, 95, 88, 90 };
 *   다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
 */
public class 배열_문제_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 94, 85, 95, 88, 90 };
		int max=num[0];
		int min=num[0];
		for(int i:num) {
			if(i>max) 
				max=i;
			if(i<min)
				min=i;
			}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	}

}
