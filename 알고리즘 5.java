import java.util.Scanner;
import java.util.ArrayList;

public class testfor {
	

	public static void main(String[] args) {
		/*9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 
		 * 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		예를 들어, 서로 다른 9개의 자연수
		3, 29, 38, 12, 57, 74, 40, 85, 61
		이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		 */
		//최댓값이 되는 기준 = 가장큰수 
		//최솟값이 되는 기준 = 가장 작은수 
	    /*int[]num = new int[9];
	    num[0]=3;
	    num[1]=29;
	    num[2]=38;
	    num[3]=12;
	    num[4]=57;
	    num[5]=74;
	    num[6]=40;
	    num[7]=85;
	    num[8]=61;
	    for(int i = 0 ; i <num.length;i++) {
	       if(num[5]>num[i]) {
	    	   System.out.println(num[5]);
	       }else if(num[0]<num[i]){
	    	   
	    	   System.out.println(num[0]);
	    	   
	       }
	    }
		
		*/
		
		 /*세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
		  *  일단 세준이는 자기 점수 중에 최댓값을
		  골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		 예를 들어, 세준이의 최고점이 70이고,
		 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		 세준이의 성적을 위의 방법대로 새로 
		 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.*/
		 //최고점이 70이다 = m 은 70이고 
		//원래 점수가 50이다 =k라하고 50이고
		//k/m*100 
		//우선 과목을 5과목이라고 가정을한다//
		//국어 수학 탐구 과학 영어 //
	   //각각의 과목의 원래 점수를 넣는다//
		/*int[] score = new int[5];
			score[0]=30;
			score[1]=50;
			score[2]=10;
			score[3]=20;
			score[4]=40;
			//자기가 친 시험중에서 제일 높게 나온 점수(최댓값)//
			int m = 0; 
			for(int i = 0 ; i<score.length;i++) {
				if(score[1]>=score[i]) {
				  m=score[1];
				}
			}
			//점수 체계//
		    int newScore1 = (m/score[0]);
		    int newScore2 = (m/score[1]);
		    int newScore3 = (m/score[2]);
		    int newScore4 = (m/score[3]);
		    int newScore5 = (m/score[4]);
		    //총합//
		    int sum= newScore1+newScore2+newScore3+newScore4+newScore5;
		    System.out.println("총합은"+sum);
		    System.out.println("평균은"+(sum/score.length));
		
*/    int sum =  0; 
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      Scanner sc1= new Scanner(System.in);
      System.out.println("점수를 입력해주세요.취소는0번");
      int point = sc1.nextInt();
      a1.add(point);
      while(point!=0) {
    	  System.out.println("점수를 입력해주세요.취소는 0번 ");
          point = sc1.nextInt();
          a1.add(point);
    	  
      }
      for(int i = 0 ; i<a1.size();i++) {
    	  sum=sum+a1.get(i);
      }
      
      System.out.println(sum);
      