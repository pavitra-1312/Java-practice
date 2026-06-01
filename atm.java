import java.util.Scanner;
public class atm{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

boolean cardInserted = true;
int password = 1234;
if(cardInserted){
System.out.println("Enter password: ");
int a = sc.nextInt();
if(a == password){
System.out.println("Enter amount to withdraw: ");
int b = sc.nextInt();
System.out.println("Money is withdrawed = " +b);
}
else{
System.out.println("Invalid password");
}
}
}
}

