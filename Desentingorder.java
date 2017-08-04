package Pro;
import java.util.*;
public class Desentingorder {
public static void main(String[] argm)
{
	Scanner s=new Scanner(System.in);
	int c=s.nextInt();
	int a[]= new int [c];
	for(int i=0;i<c;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	s.close();
}
}
