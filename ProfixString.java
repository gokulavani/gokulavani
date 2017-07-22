import java.util.*;
public class ProfixString {
 
	  public static void main(String[] ayirusinav)
	  {
		  Scanner s=new Scanner(System.in);
		  String str1=s.next();
		  String str2=s.next();
		  int length=str1.length();
		  if(length>str2.length())
		  {
			  length=str2.length();
		  }
		  StringBuilder a = new StringBuilder();
		    for(int i=0;i<length;i++)
		    {
		        if(str1.charAt(i)==str2.charAt(i))
		        {
		         a.append(str1.charAt(i));
		        }
		        else
		        {
		          break;
		        }
		    }       
		    System.out.println(a.toString());
		    s.close();
		}
	  }

