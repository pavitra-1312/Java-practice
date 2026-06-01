import java.util.Scanner;
class largest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int a = sc.nextInt();
System.out.println("Enter a number:");
int b = sc.nextInt();

if(a<b){
System.out.print("The largest number is " +b);
}
else{
System.out.print("The largest number is " +a);
}
}
}
