import java.util.*;
public class Example1 {
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
	    System.out.println("정수를 입력해주세요. 취소는 -1");
	    int s1 = sc1.nextInt();
	    while(s1!=-1) {
	    	a1.add(s1);
	    	System.out.println("정수를 입력해주세요. 취소는 -1");
		    s1 = sc1.nextInt();
	    }
	    a1.sort(null);
	    System.out.println("오름차순"+a1.toString());
	    a1.sort(Comparator.reverseOrder());
	    System.out.println("내림차순"+a1.toString());
	
	}
}
