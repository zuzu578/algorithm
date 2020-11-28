
public class Example1 {

	public static void main(String[] args) {
		//5! 를 구하는 방법1):for 문사용//
		int multi = 1;
		for(int i = 5; i>=1; i--) {
			multi = multi*i;
			System.out.println(multi);
		}
		//5! 를구하는 방법2):재귀함수를 이용//
		Result r1 = new Result();
		System.out.println(r1.result(5));
		
		
			
}
}
class Result{
	protected int result(int x) {
		if(x==1) {
			return x;
		}else {
			return x*(result(x-1)); 
		}
		
	}
	
}
