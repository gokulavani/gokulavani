package Pro;
import java.util.*;
public class ModuloforThatNumber {
public static void main(String [] argms)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int ns=s.nextInt();
	int n1=n;
	int c=0;
	int v=0;
	while(n1!=0)
	{
		v=n1%10;
		c+=n*v;
		n1=n1/10;
		
	}
	if(c==ns)
	System.out.println("seed");
	else
		System.out.println("not seed");
}
}
