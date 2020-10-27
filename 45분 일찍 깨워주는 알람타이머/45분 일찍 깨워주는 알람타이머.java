import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		//시간을 입력받는다//
		//45분 일찍 알람 설정하기//
		//예를들어 내가 10시 10분에 무언가를 해야한다 //
		//45분 일찍 앞당겨서 9시 25분에 알람을 설정 //
		System.out.println("시간을 입력해주세요.");
		int time = sc1.nextInt();
		System.out.println("분을 입력해주세요.");
		int minuet = sc2.nextInt();
		
		if(minuet<=44) {
			System.out.println((time-1)+"시"+(minuet+15)+"분");
		}else {
			System.out.println((time)+"시"+(   minuet-45   )+"분");
		 
		}
	}
}

