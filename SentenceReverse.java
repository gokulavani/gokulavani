import java.util.*;
public class SentenceReverse {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();

		String [] a=str.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			String str1=new StringBuffer(a[i]).reverse().toString();
			System.out.print(str1+" ");
		}
		s.close();
		
	}

}
