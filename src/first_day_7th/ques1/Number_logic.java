package first_day_7th.ques1;

public class Number_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		        12
//		        13
//		        21
//		        21
//		        32
//		        33

		        for (int i = 1; i <= 3; i++) {
		            for (int j = 2; j <= 3; j++) {
		                if (i % 2 != 0) {
		                    System.out.println(i+""+j);
		                }
		                else {
		                    System.out.println(i+""+1);
		                }
		            }

		        }
		    }

	}

