import java.util.Scanner;
public class 배열_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] kor=new int[3];
		int [] eng=new int[3];
		int [] math=new int[3];
		int [] total=new int[3];
		double [] avg=new double[3];
		char [] score=new char[3];
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1+"번째 국어 점수 입력:"));
			kor[i]=scan.nextInt();
			
			System.out.println((i+1+"번째 영어 점수 입력:"));
			eng[i]=scan.nextInt();
			
			System.out.println((i+1+"번째 수학 점수 입력:"));
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			switch(total[i]/30){
			case 10: case 9:
	        	score[i]='A';
	        	break;
	        case 8:
	        	score[i]='B';
	        	break;
	        case 7:
	        	score[i]='C';
	        	break;
	        case 6:
	        	score[i]='D';
	        	break;
	        default:
	        	score[i]='F';
			}
		}
		for(int i=0;i<3;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.3f%-3c\n",
						kor[i],eng[i],math[i],total[i],avg[i],score[i]);
					
		}
		

	}

}
/*		데이터형[] 배열명=new 데이터형[갯수]
 *                               ----- 배열 크기
 *       -----------------------------
 *       int = 0 , double = 0.0 boolean = false 
 *       int[] arr=new int[3];  ==> 0 0 0
 *       double[] arr=new double[3] ==> 0.0 0.0 0.0
 *       boolean[] arr=new boolean[3] ==> false false false 
 *
 */
