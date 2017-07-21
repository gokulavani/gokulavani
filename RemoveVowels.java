import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String str=s.next();
String sv="";
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
			||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='I'||str.charAt(i)=='U')
	{
		continue;
	}
	else
	{
		sv=sv+str.charAt(i);
	}
}
System.out.println(sv);
s.close();
	}

}
