package list.arraylist.implementation;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		/*
		두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의
		합을 리턴하는 함수, solution을 완성하세요.
		예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
		*/
		int a = 4;
		int b = 8;
		int sum = 0;
		for(int i = a ; i<=b ; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		C c1 = new C();
		int k = c1.Running(10);
		System.out.println(k);
	}
}
class C{
	protected int Running(int x) {
		if(x==0) {
			return 0;
		}else if(x==1) {
			return 1;
		}else {
			return Running(x-1)+Running(x-2);
		}
	}
}