package assainment1;

import java.util.Scanner;

public class problem19 {
	public static void factor(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)System.out.println(i);
			else continue;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number  ");
		int n=sc.nextInt();
		factor(n);
		sc.close();

	}

}
