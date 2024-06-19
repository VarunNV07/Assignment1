package assainment1;

import java.util.Scanner;

public class problem17 {
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println("The factorial of number "+n+" is "+fact(n));
        sc.close();
	}

}
