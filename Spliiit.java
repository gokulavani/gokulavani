import java.util.*;
public class Spliiit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();

		String a[]=str.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		s.close();
}
}