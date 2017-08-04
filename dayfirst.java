package Pro;
import java.util.*;
public class dayfirst {
public static void main(String[] argms)
{
	Scanner s=new Scanner(System.in);

	int baby=s.nextInt();
	int unique_pairs=1;
	for(int i=0;i<2*baby;i++){
		int pairs=2*baby-i;
		if(baby!=pairs){
			System.out.println(unique_pairs++);
}
		
}
	s.close();

}
}