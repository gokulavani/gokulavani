import java.util.*;
public class RemoveRepeat {
	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
	String vs=s.next();
	int flag=0;
	for(int i=0;i<vs.length();i++)
	{
		for(int j=0;j<vs.length();j++)
		{
			if(i!=j)
			if(vs.substring(i,i+1).equals(vs.substring(j,j+1)))
			flag=1;
		}
		if(flag==0)
		{
			System.out.print(vs.substring(i,i+1));
		}
		flag=0;
	}
	
	s.close();
	}

}
