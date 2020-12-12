package list.arraylist.implementation;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		String input = "helloWorlD";
		char []arr;
		//==>helloWorlD==> HELLOwORLd 이렇게 출력하면된다.//
		arr = input.toCharArray();
		for(int i = 0 ;  i < arr.length; i ++) {
			//==>1) 대문자 인 인덱스를 거르는 단계//
			if(Character.isUpperCase(input.charAt(i))==true) {
				char k = arr[i];
				System.out.print(Character.toLowerCase(k));
			}else {
			//==>2) 소문자인 인덱스를 거르는 단계//
				char l = arr[i];
				System.out.print(Character.toUpperCase(l));
			}
		}
		C c1 = new C();
		String result = c1.Running(24, 18);
		System.out.println(result);
		
	
}
}
class C{
	protected String Running(int x , int y) {
		int div = 1;
		int num1 = 1;
		int num2 = 1;
		String result = ""; 
		for(int i = 1 ; i <= 18 ; i++) {
			if(x%i==0 && y%i==0) {
				div = i;
				num1 = x/div;
				num2 = y/div;
			}
		}
		result = ("최대공약수"+":"+div+","+"최소공배수는"+":"+(div*num1*num2));
		return result;	
	}	
}

