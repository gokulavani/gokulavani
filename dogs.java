import java.util.*;
public class dogs {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0||a[i]==1)
			{
				System.out.println("true");
			}
			else 
			{
				System.out.println("false");
	
			}
		}
		s.close();
	}

}
