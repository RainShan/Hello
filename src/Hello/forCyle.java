package Hello;

import java.util.Scanner;

public class forCyle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count =0;
		
		if (number==0)
		{
			System.out.println("ling");
		}
		
		if (number <0)
		{
			System.out.print("fu ");
			number = -number;
		}
		int digits =number;
		while(digits>0)
		{
			digits =digits /10 ;
			count++;
		}
		for(count=count-1;count>=0;count--)
		{
			
			double p = Math.pow(10,count);
			int n = number/(int)p;
			number = number %(int)(p);  
			switch(n)  
			   {  
			   case 0: {System.out.print("ling");break;}  
			   case 1: {System.out.print("yi");break;}
			   case 2: {System.out.print("er");break;}  
			   case 3: {System.out.print("san");break;}  
			   case 4: {System.out.print("si");break;}  
			   case 5: {System.out.print("wu");break;}  
			   case 6: {System.out.print("liu");break;}
			   case 7: {System.out.print("qi");break;}
			   case 8: {System.out.print("ba");break;} 
			   case 9: {System.out.print("jiu");break;}  
			   } 
			 if(count>0)  
				    System.out.print(" ");  
		}
	}

}
