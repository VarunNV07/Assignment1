package assainment1;

import java.util.Scanner;

public class problem14 {
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
		System.out.println("Enter the range : ");
		int min=sc.nextInt();
		int max=sc.nextInt();
		for(int n=min;n<max;n++) {
		int count=count(n);
		int sum=armstrong(n,count);
		if(n==sum)System.out.println(sum);
		else continue;
		}
		sc.close();
		


	}

}


