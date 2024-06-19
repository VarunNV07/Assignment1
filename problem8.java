package assainment1;

import java.util.Scanner;

public class problem8 {
	public static boolean isprime(int n) {
		for(int i=2;i*i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static boolean isprime2(int n,int i) {
		if(i*i<n) {
			if(n%i==0)return false;
		 isprime2(n,i+1);
	}
		return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		//boolean res=isprime2(n,2);
		boolean res=isprime(n);
		if(res==true)System.out.println(n+" is a prime number");
		else System.out.println(n+" is not a prime number");
		sc.close();

	}

}
