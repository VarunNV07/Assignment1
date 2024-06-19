package assainment1;

import java.util.Scanner;

public class problem5 {

	public static void sums(int min,int max) {
		int sum=0;
		for(int i=min;i<=max;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of the numbers in an interval is : "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of number :");
		int min=sc.nextInt();
		int max=sc.nextInt();
		sums(min,max);
        sc.close();
	}

}
