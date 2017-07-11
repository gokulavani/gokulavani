package program;
import java.util.*;
public class ReverseDigit {
public static void main(String[] ayirusinav)
{
	Scanner vs=new Scanner(System.in);
	int sv=vs.nextInt();
	int magis=0;
	while(sv!=0)
	{
		magis=sv%10;
		sv=sv/10;
		System.out.print(magis);
	}
	vs.close();
}
}
