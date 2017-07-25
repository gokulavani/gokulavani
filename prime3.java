import java.util.*;
public class prime3 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int  n=s.nextInt();
int b=0;
int c=0;
int num=1;
while(num <=n)
{
    b=1;
    c=0;
    while(b<= num)
         {
           if((num%b)==0)
             c=c+1;
             b++;
         }
            if(c==2)
            {
            if(num%10==3)	
System.out.println(num );
            }
             num ++;
            
            
 }
s.close();
	


	}
}

