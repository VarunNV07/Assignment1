package assainment1;
import java.util.*;

public class problem21 {
	public static int perfect(int n) {
		int res=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)res+=i;
			else continue;
		}
	return res;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int n=sc.nextInt();
		int res=perfect(n);
		if(n==res)System.out.println(res+" is a perfect number.");
		else System.out.println(res+" is not a perfect number.");
		sc.close();
		

	}

}
