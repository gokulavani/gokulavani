import java.util.*;
public class LeapYera {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		int count=0;
		if(year%4==0)
			for(int i=0;i<20;i++)
			{
				year+=4;
				System.out.println(year);
				

			}
		  s.close();                                  
	}

}
