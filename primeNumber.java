import java.io.*;

public class primeNumber {
	public static void main(String[] args) throws IOException
    {
        int x;
      
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 
        {
            System.out.println("1. Triangle");
            System.out.println("2. circle");
            System.out.println("3. rectangle");
            System.out.println("enter your choice:");
            int a= Integer.parseInt(br.readLine());
            switch (a){    
            case 1:
                System.out.println("Enter Length and side:");
                x = Integer.parseInt(br.readLine());
                System.out.println("The area of triangle  is" + (0.5*x*x));
                break;
            case 2:
                System.out.println("enter the value of radius");
                int r = Integer.parseInt(br.readLine());
                System.out.println("The area of circle is" +(3.141*r*r));
                break;
            case 3:
                System.out.println("Enter Length and sides:");
                int     l = Integer.parseInt(br.readLine());
                int   b = Integer.parseInt(br.readLine());
                System.out.println("The area of rectangle is" + (l*b));
                break;
            default:
                System.out.println("Invalid Entry!");
            }
}
    }
}