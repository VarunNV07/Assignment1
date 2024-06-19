package assainment1;
import java.util.*;

public class problem4 {
	public static int greatest(int a,int b) {
		return a>b?a:b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		System.out.println("The greatest number is "+greatest(a,b));
		sc.close();

	}

}
