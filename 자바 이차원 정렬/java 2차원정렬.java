import java.util.Scanner;
public class New1 {

	public static void main(String[] args) {
		//2)5x5의 이차원 List 에 1부터 25의 값을 다음과 같은 순서로 채워넣는
		//프로그램을 작성하시오.//
		//1 2 3 4 5 
		//10 9 8 7 6
		//11 12 13 14 15 
		//20 19 18 17 16
		//21 22 23 24 25
		
		/*1) 5개씩 5번 담을 수있는 2차원배열*/
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int a1 =0;
		int a2 = 0;
		System.out.println("정수를 입력해주세요.");
		 a1 = sc1.nextInt();
		while(a1!=0) {
			System.out.println("정수를 입력해주세요.");
			a2 = sc2.nextInt();
			break;
		}
		//a1은 세로 a2는 가로 //
		int[][]array1  = new int[a1][a2];
		int n1 = 1;
		int j = 0;
		int k = 0;
		int i = 0;
		for( i = 0 ; i<a1 ; i++) {
			if(i%2==0) {
		      for( j =0 ;j<a2 ; j++) {
				array1[i][j]=n1;
				n1++;
			}
		      
			}else {
				for(k = a2-1; k>=0 ; k=k-1) {
					array1[i][k]=n1;
					n1++;
				}
				
			}
			
		}
		for(int l = 0 ; l<a1; l++) {
			for(int m = 0 ; m<a2 ;m++) {
				System.out.print(array1[l][m]+" ");
				}
			System.out.println("");
		}
		
		
	}
}