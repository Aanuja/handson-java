package first_day_7th.ques3;
import java.util.Scanner;


public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int year;
      
        	System.out.println("Enter the year whichever you want?");
        year = in.nextInt();
          if(year % 400 == 0)
        {
        	  System.out.println("\n" + year+ " is a leap year ");
        }
        else if(year % 100 == 0)
        {
        	System.out.print("\n" + year+ " is not a leap year ");
        }
        else if (year % 4 == 0)
        {
        	System.out.print("\n" + year+ " is a leap year ");
        }
        else {
        	System.out.print("\n" + year+ " is  not a  leap year ");
        }
	}

}
