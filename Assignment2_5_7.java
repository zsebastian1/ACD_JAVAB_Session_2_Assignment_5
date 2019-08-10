package AssignmentSession2;

import java.util.Scanner;

public class Assignment2_5_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to test the Armstrong method");
		int n = input.nextInt();
		int c=0,a,temp; 
		
		   temp = n; 
		
		   while(n>0) { 
		
		   a=n%10; 
		
		   n = n/10; 
		
		    c=c+(a*a*a); 
		} 
		
		    if(temp==c) 
		
		    System.out.println("This is an armstrong number!");  
		
		    else 
		
		        System.out.println("This is NOT an armstrong number..");  
		
	}

}
