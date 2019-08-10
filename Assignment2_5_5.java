package AssignmentSession2;

import java.util.Scanner;

public class Assignment2_5_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to see if it is prime or not: ");
		int num = input.nextInt();
		
		boolean isPrime = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                isPrime = true;
	                break;
	            }
	        }
	        if (!isPrime)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	}

}
