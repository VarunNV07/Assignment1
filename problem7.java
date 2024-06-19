package assainment1;

import java.util.Scanner;

public class problem7 {
	public static boolean isleap(int a) {
		if(a%4==0||a%100==0||a%400==0)return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year: ");
		int a=sc.nextInt();
		boolean res=isleap(a);
		if(res==true)System.out.println(a+" is a leap year.");
		else System.out.println(a+" is not a leep year.");
        sc.close();
	}

}
