import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		/*a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 
		 * (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
		리턴값: a에 포함되어 있는 정수 n개의 합*/
		Calculator c1 = new Calculator();
		c1.Calcul1(100);
		//System.out.println(c1.Calcul1(100));
		int n = 0 ;
		int result = c1.Calcul1(100);
		System.out.println(result);
	}

	

}


class Calculator{
	int []a2 =new int [1000];		
	ArrayList a1 = new ArrayList();
	int sum;
	
     
	Calculator(){

		a2 = new int[1000];
	}
	 
	public int Calcul1(int x ){
		int f = x;
		for(int i = 0 ; i<=f;i++) {
			sum=sum+(a2[i]=i);
			System.out.println(sum);
		}
		return sum;
	}
	
}