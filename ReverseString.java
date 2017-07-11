package program;
import java.util.*;
public class ReverseString {
	public static void main(String []ayirusinav)
	{
		Scanner vs=new Scanner(System.in);
		String str1=vs.next();
		StringBuffer sb=new StringBuffer(str1);
		System.out.println(sb.reverse());
		vs.close();
	}

}
