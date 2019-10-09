package quantumTraining1;

import java.util.Scanner;

public class mulNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Input second number: ");
		  int num2 = in.nextInt();
		   
		  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		  
		  
		  Scanner iln = new Scanner(System.in);
		   
		  System.out.print("Input a number: ");
		  int num3 = iln.nextInt();
		   
		  for (int i=0; i< 10; i++){
		   System.out.println(num3+ " x " + (i+1) + " = " + 
		     (num3 * (i+1)));
		  }

	}

}
