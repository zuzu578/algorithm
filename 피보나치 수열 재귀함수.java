import java.util.*;
public class Example1 {
	//재귀함수로 피보나치수 구하기//
	
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		C c1 = new C();
		//int n = 0;
		for(int i = 0 ; i < 10 ; i ++) {
			//n=i;
			System.out.println(c1.c(i));
		}
	}
}
class C{
	protected int c(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1; 
		}else {
			return c(n-1)+c(n-2);
		}
	}
	
	
}