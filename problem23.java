package assainment1;

import java.util.Scanner;

public class problem23 {
	public static boolean perfect(int n) {
		for(int i=2;i<=n/2;i++) {
			if(i*i==n)return true;
			else continue;
		}return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		boolean res=perfect(n);
		if(res==true)System.out.println(n+" is a perfect Square number.");
		else System.out.println(n+" is not a perfect square number");
        sc.close();
	}

}
