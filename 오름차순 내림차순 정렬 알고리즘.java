import java.util.ArrayList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		//1.두 정수를 입력받는다//
		Scanner sc1= new Scanner(System.in);
		System.out.println("정수를입력해주세요.");
		int num1 = 0 ;
		int num2 = 0;
		int n = 1; 
		
		num1 = sc1.nextInt();
		while(num1!=0) {
			System.out.println("정수를 입력해주세요.");
			num2 = sc1.nextInt();
			
			break;
		}
		//2.2차원 배열을 만든다//
		int [][]array = new int[num1][num2];
		//-->column 열(세로가)몇줄인지를 정하는 for)//
		for(int i = 0 ; i<num1;i++) {
			//row 행(가로가) 몇줄인지를 정하는 if//
			//짝수일때 오름차순으로 정렬//
			if(i%2==0) {
			  for(int j = 0 ; j<num2; j++) {
				   array[i][j]=n;
				  n++;
			  }
			  //홀수일때 내림차순을 정렬//
			}else {
				for(int k = num2-1 ; k>=0; k--) {
					array[i][k] = n;
					n++;
				}
			}
		}
		//나온 결과(2차원배열)출력//
		//result 출력//
		for(int q = 0 ; q<num1 ; q++) {
			for(int p = 0; p<num2 ; p++){
				System.out.print(array[q][p]+" ");
			}
			System.out.println("");
		}
		}
		
	}
