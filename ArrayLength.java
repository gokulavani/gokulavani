import java.util.*;
public class ArrayLength {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int [] a=new int [r];
int count=0;
for(int i=0;i<r;i++)
{
	
	a[i]=s.nextInt();
		
	
}
int vs=s.nextInt();
for(int i=0;i<r;i++)
{
	if(vs==a[i])
	{
		count++;
	}
}
System.out.println(count);
s.close();
	}

}
