import java.util.*;
public class CoPrimes {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int Num1=s.nextInt();
int num2=s.nextInt();
int count=0;
if(Num1==1||num2==1)
{
	if(Num1==2||num2==2)
		System.out.println("co-prime");
}
if(Num1==1||num2==1)
{
	if(Num1==3||num2==3)
		System.out.println("co-prime");
}
if(Num1==2||num2==2)
{
	if(Num1==3||num2==3)
	{
	System.out.println("co-prime");
	}
}
else
{    if(Num1!=0)
	 {for (int i = 1; i <= Num1; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;}
		    if(num2!=0)
			 {for (int k = 1; k <= Num1; k++) {
				   count = 0;
				   for (int m = 2; m <= i / 2; m++) {
				    if (i % j == 0) {
				     count++;}
}
	}

	 }
}
	 }
	 }

if(count==0)
{
	System.out.println("co-prime");
	
}
else
{
	System.out.println(" Not co-prime");

}
}
s.close();
	}
}

