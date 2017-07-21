
import java.util.*;
public class RepeatedStringMaximum {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String str=s.next();
		int count=0;
		int max=0;
		String str1=new StringBuffer(str).reverse().toString();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str.substring(i,i+1).equals(str1.substring(j,j+1)))
				{
					count++;
					if(count>max)
					{
						max=count;
					}
				}
				
			}
			count=0;
		}
		System.out.println(max);
		s.close();
	}

}
