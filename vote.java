import java.util.Scanner;
class vote
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int age = sc.nextInt();
if(age>=18){
System.out.print("Eligible to vote");
}
else{
System.out.print("Not eligible to vote");
}
}
]