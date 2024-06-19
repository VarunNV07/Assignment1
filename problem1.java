package assainment1;
import java.util.*;

public class problem1 {
	public static void posOrneg(int a) {
		if(a>0)System.out.println("The number "+a+" is positive.");
		else System.out.println("The number "+a+" is a negative.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		posOrneg(a);
		sc.close();

	}

}
