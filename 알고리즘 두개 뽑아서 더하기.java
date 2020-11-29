package list.arraylist.implementation;
import java.util.*;
public class Main {
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		//값을 넣기위한 배열//
		ArrayList<Integer>a1 = new ArrayList<Integer>();
		//값을 출력하기위한 배열//
		ArrayList <Integer>a2 = new ArrayList <Integer>();
		System.out.println("숫자를 입력하시오.");
		int num1 = sc1.nextInt();
		while(num1>=0) {
			a1.add(num1);
			System.out.println("숫자를 입력하시오.");
			num1 = sc1.nextInt();
		}
		for(int i =0 ; i<a1.size(); i++) {
			for(int j = i+1; j<a1.size();j++) {
				if(a1.get(i)==a1.get(j)){
					a1.remove(i);
				
				}
				a2.add(a1.get(i)+a1.get(j));
				HashSet<Integer>d = new HashSet<Integer>(a2);
				a2 = new ArrayList<Integer>(d);
		   
			}
		}
		System.out.println(a2);
		
}
}