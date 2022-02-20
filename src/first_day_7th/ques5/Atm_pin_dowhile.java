package first_day_7th.ques5;
import java.util.Scanner;
public class Atm_pin_dowhile {

	 static int code = 1111;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   
		        int pin;

		        System.out.println("Welcome to SBI ");
		        System.out.println(" Insert your ATM card ");
		        System.out.println(" Enter your ATM pin ");
		        Scanner sc = new Scanner(System.in);
		        pin = sc.nextInt();


		        do {
		            if (pin == code) {
		                System.out.println("correct pin \n 1. balance check \n 2. change pin\n 3. cash withdraw\n 4.Exit \nPlease enter your choice");
		                int opt = sc.nextInt();
		                if (opt == 1)
		                    checkBal();
		                else if (opt == 2)
		                    changePin();
		                else if (opt == 3)
		                    withdraw();
		                else System.out.println("Incorrect Option Selected");
		            } else {
		                System.out.println("Logged Out");
		                break;
		            }
		        } while (true);
		    }

		    private static void withdraw() {
		        System.out.println("100 withdrawn");
		    }

		    private static void changePin() {
		        System.out.println("Pin changed to 5555");
		        code=5555;
		    }

		    private static void checkBal() {
		        System.out.println("Balance 1500");
		    }
		}