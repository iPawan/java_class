package quantumTraining1;

import java.util.Scanner;

public class Fibino1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, first = 0,next = 1;
        
        System.out.println("Enter fibonnaci numbers of n");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci are: ");
        System.out.print(first + " " + next);
       
        
       
        for (int i = 2; i<=n; i++)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
        }
       // System.out.println("Sum:" +sum);
     
      
        
	}
}
