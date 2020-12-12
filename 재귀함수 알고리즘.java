package java01;

import java.util.ArrayList;



public class main01 {

	public static void main(String[] args) {
		int result4 = 1; 
		C c1= new C();	
		String result = c1.Running1(10);
		System.out.println(result);
		D d1 = new D();
		int result2 = d1.Running2(2,4);
		System.out.println(result2);
		int x = 2;
		for(int i = 1 ; i <=4 ; i++) {
			result4 = result4 * x;
		}
		System.out.println(result4);
	}
}
class C{
	protected String Running1(int x) {
		if(x==1) {
			return "hello world";
		}else {
			System.out.println("hello world");
			return Running1(x-1);
		}
	}
}
class D{
	protected int Running2(int x, int y) {
		if(y==1) {
			return y+1;
		}else {
			return x*Running2(x,y-1);
		}
		
	}
}