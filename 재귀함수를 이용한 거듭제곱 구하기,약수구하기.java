package java01;

import java.util.ArrayList;

public class main01 {

	public static void main(String[] args) {
		//재귀함수로 거듭제곱 구하기//
		C c1 = new C();
		int result1 = c1.Running1(2,4);
		System.out.println(result1);
		
		D d1 = new D();
		System.out.println(d1.Running2(16));
		
		E e1 = new E();
		System.out.println(e1.Running3(4));
	   
		
		//for문을 이용한 거듭제곱 구하기 //
		int result = 1;
		
		for(int i = 1; i <= 4; i++) {
			result = result * 2;
		}
		System.out.println(result);
		
		
		
	}
}
class C{
	protected int Running1(int x , int y) {
		if(y==1) {
			return y+1;
		}else {
			return x*Running1(x,y-1);
		}
	}
}
class D{
	protected ArrayList<Integer> Running2(int x) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		int result = 1;
		for(int i = 1 ; i <=x ; i++) {
			if(x%i==0) {
				a1.add(i);
				
			}
			
		}
		return a1;
		
	}
}
class E{
	protected String Running3(int x) {
		String hello = "hello";
		if(x==1) {
			return hello;
		}else {
			System.out.println("hello");
			return Running3(x-1);
		}
		
	}
}
