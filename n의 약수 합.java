package newnew1;
import java.util.Scanner;

public class new01 {

	public static void main(String[] args) {
		//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.//
		int sum = 0;
		int n = 5;
		int div = 0 ;
		for(int i = 1; i<=12; i++) {
			if(n%i==0) {
				div = n/i;
				sum = sum+div;
				System.out.println(sum);
			}
		}
		
	}
}


