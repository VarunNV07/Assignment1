package assainment1;

import java.util.Scanner;

public class problem18 {
	public static int power(int a,int count) {
		int pow=1;
		for(int i=1;i<=count;i++) {
			pow*=a;
		}return pow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value : ");
		int base=sc.nextInt();
		System.out.println("Enter the exponent value : ");
		int expo=sc.nextInt();
		System.out.println(power(base,expo));
		sc.close();

	}

}
