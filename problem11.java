package assainment1;

import java.util.Scanner;

public class problem11 {
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {
			rev*=10;
			rev+=n%10;
			n=n/10;
		}return rev;
	}
	public static int reverse1(int n,int rev) {
		if(n==0)return rev;
		rev*=10;
		rev+=n%10;
		return reverse1(n/10,rev);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("The reversed number is "+reverse(n));
        //System.out.println("THe reversed number is "+reverse1(n,0));
        sc.close();
	}

}
