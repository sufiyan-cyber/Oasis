import java.util.Scanner;
public class AtmInterfaceExample{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double amt,transferAmt;
double balance=3000;
int choice;
while(true)
{
System.out.println("------ATM INTERFACE--------\n");
System.out.println("1.Check balance");
System.out.println("2.Deposit");
Sytem.out.println("3.Withdraw");
System.out.println("4.Transfer details");
System.out.println("5.Transaction details");
System.out.println("6.Exit");
System.out.println("Enter a choice from 1 to 6");
choice=sc.nextInt();

switch(choice)
{
case 1:
System.out.println("The Current balance is" +balance+"rupees");
break;
case 2:System.out.println("Enter the amount to be deposited");
amt=sc.nextDouble();
balance+=amt;
System.out.println("Updated balance is"+balance+ "rupees");
break;
case 3:System.out.println("Enter the amount to withdraw");
amt=sc.nextDouble();
if(amt>balance||amt<0)
{
System.out.println("Insufficient balance to withdraw the amount");
}
else{
balance-=amt;
System.out.println("Current balance is"+balance+ "rupees");
}
break;
case 4:
System.out.println("Enter the recipient name");
Styring recipient = sc.next();
System.out.println("Enter the transfer amount");
transferAmt = sc.nextDouble();
if(transferAmt>balance){
System.out.println("Insufficient amount to tranfer");
}else{
balance-= transferAmt;
System.out.println("Transfered"+transferAmt+"rupeees to" +recipient+"\n");
}
break;
case 5: double transHistory = sc.nextDouble();
System.out.println("Transaction history");
if (transHistory.isEmpty()) {
                    System.out.println("No transactions yet.");
                } else {
                    System.out.println(history);
                }

break;
case 6:System.out.println("Thanks for using our ATM service, have a good day!!");
sc.close();
System.exit(0);
break;
default: System.out.println("Enter a valid choice");
}
}
}
}