package list.arraylist.implementation;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		C c1 = new C();
		c1.running();
		
}
}
class C{
	Scanner sc1= new Scanner(System.in);
	protected void running() {
		String s1 = "BaekjoonOnlineJudge";
		for(int i = 0 ; i < s1.length(); i++ ) {
			System.out.print(s1.charAt(i));
			if(i%4==3) {
				System.out.println();
			}
		}
		/*
		String str = "BaekjoonOnlineJudge";
		String str1 = "OneTwoThreeFourFiveSixSevenEightNineTen";
		String p3 = str1.substring(0,10);
		String p4 = str1.substring(10,20);
		String p5 = str1.substring(20,30);
		String p6 = str1.substring(30,39);
		String p1 = str.substring(10);
		String p2 = str.substring(0,10);
		System.out.println(p2);
		System.out.println(p1);
		System.out.println(p3);
		System.out.println(p6);
		System.out.println(p5);
		System.out.println(p4);
		*/
		
		
}
}