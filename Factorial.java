package program;
import java.util.*;
public class Factorial {

	public static void main(String[] ayirusinav) {
		Scanner vs=new Scanner(System.in);
		
		System.out.println("Enter the factorial number");
		int n=vs.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
System.out.println("The Factorial value is "+fact);
vs.close();

	}

}
