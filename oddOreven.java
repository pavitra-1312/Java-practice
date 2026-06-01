import java.util.Scanner;
class oddOreven
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int a = sc.nextInt();
if(a%2 == 0){
System.out.print("Even number");
}
else{
System.out.print("odd number");
}
}
}
