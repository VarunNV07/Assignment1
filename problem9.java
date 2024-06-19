package assainment1;

import java.util.Scanner;

public class problem9 {
	public static boolean isprime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static boolean recursion(int n,int i) {
		if(i*i<n) {
			if(n%i==0)return false;
		 recursion(n,i+1);
	}
		return true;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int min=sc.nextInt();
		int max=sc.nextInt();
		for(int j=min;j<=max;j++) {
		
		//boolean res=recursion(j,2);
		boolean res=isprime(j);
		
		if(res==true)System.out.println(j);
		}
		sc.close();


	}

}
