package first_day_7th.ques2;

public class Pattern_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*to print like this
*
**
***
****
*****
****
***
**
*
             */
          int i, j ;
          for(i=1;i<=5;++i)
          {
        	  for(j=1 ;j<=i; ++j ) 
        	  {
        	  System.out.print("*");
          }
          
          System.out.println();
           }
	 for(i=4; i>=1; --i)
	 {
		 for(j=1; j<=i; ++j)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 }

}
