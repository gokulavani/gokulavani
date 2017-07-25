import java.util.*;
public class prime3{

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int  n=s.nextInt();

	int flag = 0;
	int sum = 0;
	for(int i=2;i<=n;i++) {
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag=1;
			}
		}
		if(flag==0) {
			if(i==3||i%10==3) {
			  sum+=i;
			}
		}
		flag=0;
}
System.out.println(sum );
s.close();
	


	}
}

