package assainment1;
import java.util.Scanner;

public class problem6 {
	public static int greatest(int a,int b,int c) {
		return a>b&&a>c?a:b>c?b:c;
		//return b>great?b:great;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a=sc.nextInt();
		System.out.println("Enter the second number :");
		int b=sc.nextInt();
		System.out.println("Enter the third number :");
		int c=sc.nextInt();
		System.out.println(greatest(a,b,c));
		sc.close();

	}

}
