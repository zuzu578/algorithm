
public class Example1 {

	public static void main(String[] args) {
		Result r1 = new Result();
		r1.running();	
}
}
class Result{
	int div ;
	int s1;
	int s2;
	int x;
	int y;
	Result(){
		this.x = 20;
		this.y = 24;
	}
	protected void running() {
		
		for(int i = 1; i<=x; i++) {
			if(x%i==0 && y%i==0) {
				this.div = i;
				this.s1=x/this.div;
				this.s2=y/this.div;
			}
		}
		System.out.println("최대공약수는"+this.div);
		System.out.println("최소공배수는"+this.div*s1*s2);
	
	}
	
	
}
