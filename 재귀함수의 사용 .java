

public class testfor {

	public static void main(String[] args) {
		//재귀함수 이용하기//
		
		//1)1부터 100까지 합//
		C c1 = new C();
		System.out.println(c1.running(100));
		//2)피보나치 수열//
		D d1 = new D();
		System.out.println(d1.running2(10));
		//3)팩토리얼//
		F f1 = new F();
		System.out.println(f1.running3(5));
	    
		
		
		
	
}

}
class C{
	protected int running(int x) {
		if(x==1) {
			return x;
		}else {
			return x+running(x-1);
		}
		
	}
	
}
class D{
	protected int running2(int x) {
		if(x==0) {
			return 0;
		}else if(x==1) {
			return 1;
		}else {
			return running2(x-1)+running2(x-2);
		}
	}
}
class F{
	protected int running3(int x) {
		if(x==1) {
			return x;
		}else {
			return x*running3(x-1);
	
		}
	}
}
	




