import java.util.Scanner;
class User {
User () {}
public static void main(String [] args) {
Scanner scan = new Scanner (System.in);
System.out.print("Enter actual Returned Day: ");
int actualReturnedDay = scan.nextInt();
System.out.print("Enter actual Returned Month: ");
int actualReturnedMonth = scan.nextInt();
System.out.print("Enter actual Returned Year: ");
int actualReturnedYear = scan.nextInt();
System.out.print ("Enter expected Returned Day: ");
int expectedReturnedDay = scan.nextInt();
System.out.print ("Enter expected Returnrd Month: ");
int expectedReturnedMonth = scan.nextInt();
System.out.print ("Enter expected Returned Year: ");
int expectedReturnedYear = scan.nextInt();
if(actualReturnedYear > expectedReturnedYear) {
System.out.println("fine = 10000 Hackos");
}
else if(actualReturnedMonth > expectedReturnedMonth) {
System.out.println("fine = " + 500 * (actualReturnedMonth - expectedReturnedMonth) + "Hackos");
}
else if(actualReturnedDay > expectedReturnedDay) {
System.out.println("fine = " + 15 * (actualReturnedMonth - expectedReturnedMonth) + "Hackos");
}
else if(actualReturnedDay <= expectedReturnedDay) {
System.out.println("fine = 0");
}
}
}
