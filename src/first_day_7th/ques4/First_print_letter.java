package first_day_7th.ques4;
import java.util.Scanner;
public class First_print_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the number of rows ");
       /* print first letter of your name
 * 
* *
***
* *
* *

        */
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for(int i=0; i<n; i++)
       {
    	   for(int j=0; j<=n/2; j++)
    	   {
    		   if(i==0 && j!=0 && j!=n/2 || j==0 && i!=0 || j==n/2 && i!=0 || i==n/2)
    		   {
    			   System.out.print("*");
    		   }
    		   else
    		   {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
