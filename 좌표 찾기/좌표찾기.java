import java.util.Scanner;

public class Test {
//좌표찾기 //
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.running();
		
	}
}

class Calculator{
   int x;
   int y; 
    
   
    Calculator() {
	   
    	x=12;
    	y=-5;
   }
		void running(){

		if(x>0 && y>0) {
			System.out.println("1사분면");
		}else if(x<0 && y>0) {
			System.out.println("2사분면");
		}else if(x<0 && y<0) {
			System.out.println("3사분면");
			
		}else {
			System.out.println("4사분면");
		}
	  

	}
}
