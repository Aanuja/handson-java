package eleven_day_21th.ques2;


import java.sql.*;

	import java.util.Scanner;
         
	public class Develop {
				public static void main(String args[])
				{
					int Amt;
					int Phoneno;
					Scanner sc = new Scanner(System.in);
				
					System.out.println("Enter customer name :- ");
					String Custname = sc.nextLine();
					System.out.println("Enter account number :- ");
					String Accno = sc.nextLine();
					try
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						System.out.println("Driver is loading...");
						
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankinfo","root","Laxmi@123");
						System.out.println("Connceting to database");
						
						PreparedStatement pr =con.prepareStatement("select * from bank where Accno = ?");
						pr.setString(1,Accno);
						
						int data = pr.executeUpdate();
						
						System.out.println(pr);
						String acc;
						ResultSet rs = pr.executeQuery();
						rs.next();
						
						acc = rs.getString(1);
						Custname = rs.getString(2);
						Amt= rs.getInt(3);
						Phoneno = rs.getInt(4);
						if ( acc == Accno )
						{
							int choice;
							do
							{
								System.out.println("1. Check balance");
								System.out.println("2. Deposit amount");
								System.out.println("3. Withdraw money");
								System.out.println("4. Exit   ");
								System.out.println(" Enter your choice: ");
								choice = sc.nextInt();
								switch(choice)
								{
								case 1:
									System.out.println("Available balance : "+Amt);
									break;
								case 2:
									System.out.println("Enter the amount to deposite : ");
									
									int Money = sc.nextInt();
									
									PreparedStatement pr1 =con.prepareStatement("update bank set Amt =? where Accno =?");
									
									pr1.setInt(1, Money+Money);
									pr1.executeUpdate();
									System.out.println(Money+" amount deposited");
									break;
								case 3:
									if(Amt<10000)
									{
										System.out.println("Insufficient Amount");
									}
									else
									{
										System.out.println("Enter Amount to withdraw :- ");
										
										int withdraw = sc.nextInt();
										PreparedStatement pr2 =con.prepareStatement("update bank set Amt =? where Accno =?");
										
										pr2.setInt(1, Amt-withdraw);
										pr2.executeUpdate();
										System.out.println(withdraw+" Amount withdraw");
									}
									break;
								case 4:
									break;
								default :
									System.out.println("exit");
								}
							}while(choice<=4);
						}
						else
						{
							System.out.println("Sorry you are not registred in this bank");
						}
						con.close();
					}
					catch(Exception e)
					{
						
					}
				}

			}

