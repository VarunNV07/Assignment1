package assainment1;
import java.util.*;

public class problem15 {
	public static void fib(int n) {
		int sum=0;
		int a=0;
		int b=1;
		for(int i=0;i<n;i++) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		fib(n);
		sc.close();

	}

}
