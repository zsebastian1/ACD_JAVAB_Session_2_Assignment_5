package AssignmentSession2;

import java.util.Scanner;

public class Assignment2_5_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number you want to start your iteration at: ");
		int s = input.nextInt();
		
		System.out.println("Enter the amount of iterations that will occur: ");
		int n = input.nextInt();
		
		for(int i = s; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
