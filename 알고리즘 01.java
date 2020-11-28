
public class Example1 {

	public static void main(String[] args) {
		int a= 5;
		int b= 8;
		int c= 4;
		if((a+b)%c==((a%c) + (b%c))%c) {
			int k = (a+b)%c;
			int q = ((a%c) + (b%c))%c;
			boolean n =(a+b)%c==((a%c) + (b%c))%c;
			System.out.println(n);
			System.out.println(k+","+q);
		}else {
			System.out.println(false);
		}
		if((a*b)%c== ((a%c) * (b%c))%c) {
			System.out.println(true);
			int r = (a*b)%c;
			int o = ((a%c) * (b%c))%c;
			System.out.println(r+","+o);
		}else {
			System.out.println(false);
		}
}

}



import java.util.*;
public class Example1 {
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		int k = 0;
		System.out.println("insert words");
		String word = sc1.nextLine();
		for(int i= 1; i<word.length();i++) {
			k = i;
		}
		System.out.println(k);
		}
	}





import java.util.*;
public class Example1 {
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(7);
		a1.add(0);
		a1.add(0);
		a1.add(2);
		a1.add(4);
		a1.add(8);
		a1.add(5);
		a1.add(1);
		
		for(int i = 0 ; i<a1.size();i++) {
			sum = sum+a1.get(i);
			System.out.println(sum);
		}
	
	
	}
}

