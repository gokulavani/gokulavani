import java.util.*;
public class Star {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int sv=n*2;
 for(int i=0;i<n;i++)
 {
	 for(int j=0;j<sv;j++)
	 {
		 if(j==sv/2)
				System.out.print(" ");
	 System.out.print("*");

	 }
	 sv=sv-2;
	 
System.out.println("\n");
}
s.close();
}
	
}