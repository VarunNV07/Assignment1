package assainment1;

import java.util.Scanner;

public class problem13 {
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	public static int power(int a,int count) {
		int pow=1;
		for(int i=1;i<=count;i++) {
			pow*=a;
		}return pow;
	}
	public static int armstrong(int n,int count) {
		int res=0,sum=0;
		while(n>0) {
			res=n%10;
			//System.out.println(power(res,count));
			sum=sum+power(res,count);
			n=n/10;
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int count=count(n);
		int sum=armstrong(n,count);
		System.out.println(sum);
		if(n==sum)System.out.println("The given number is armstrong number");
		else System.out.println("The number is not a Armstrong");
		sc.close();
		

	}

}
