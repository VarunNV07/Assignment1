package assainment1;

import java.util.Scanner;

public class problem3 {
	public static void sum(int n) {
		System.out.println(n*(n+1)/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n=sc.nextInt();
		sum(n);
		sc.close();

	}

}
