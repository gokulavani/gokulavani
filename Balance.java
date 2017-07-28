import java.util.*;
public class Balance {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.next();
		int sv=0;
		int vs=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.length()%2!=0)
			{
				System.out.println(str+" is not Balance");
			}
			else if((str.charAt(i)>='a'&&str.charAt(i)<='m')||(str.charAt(i)>='A'&&str.charAt(i)<='M'))
					{
				sv++;
					}
			else
			{
				if((str.charAt(i)>='n'&&str.charAt(i)<='z')||(str.charAt(i)>='N'&&str.charAt(i)<='Z'))
						{
					vs++;
						}
			}
		}
		if(sv==vs)
		{
			System.out.println(str+" is Balance");
		}
		else
		{
			System.out.println(str+" is not Balance");
		}
		s.close();
		
	}

}
