package list.arraylist.implementation;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int result = 0;
		//각 자릿수 합 구하기//
		ArrayList <Integer>a1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해라.");
		int number = sc.nextInt();
		while(number!=0) {
			a1.add(number);
			System.out.println("숫자를 입력해라.");
			number = sc.nextInt();
		}
		System.out.println(a1);
	
		for(int i = 0 ; i < a1.size(); i++) {
			result = a1.get(i)+result;
		}
		System.out.println(result);
}
}

