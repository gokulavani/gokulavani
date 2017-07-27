import java.util.*;
public class MultipleDigits {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int number=s.nextInt();
int num=number;
int n=0;
int n1=0;
int mul=0;
int m=1;

int count =0;
while(number!=0)
{
	n=number%10;
	number=number/10;
	count++;
}

while(num!=0)
{n1=num%10;
num=num/10;

	for(int i=0;i<count;i++)
	{
		
	
	
	m*=n1;
	
}
	mul+=m;
	m=1;
}
	
System.out.println(mul);
s.close();
	}

}
