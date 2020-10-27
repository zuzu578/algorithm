import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		System.out.println("날짜를 입력해주세요.");
		int n = sc1.nextInt();
	if(n%4==0 && n%100!=0 ||n%400==0) {
	  System.out.println(n+"년은"+"윤년입니다.");
	}else {
	System.out.println(n+"년은"+"윤년이 아닙니다.");
	}
	}
	
}
