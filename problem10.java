package assainment1;

import java.util.Scanner;

public class problem10 {
public static int sumOfDig(int n) {
		int sum=0;
		while(n!=0) {
		sum+=n%10;
		n=n/10;
	}return sum;
	}
     public static int countOfDig(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		//int count=countOfDig(n);
		System.out.println("The sum of digits is "+sumOfDig(n));
		sc.close();

	}

}
