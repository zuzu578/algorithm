package list.arraylist.implementation;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int k = 72;
		int div = 1;
		int n = 1;
		for(int i = 2 ; i<=k ;i++) {
			while(k%i==0) {
				k=k/i;
				System.out.println(i);
			}
	}
			
	}
}