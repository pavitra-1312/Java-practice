import java.util.Scanner;
class passOrfail{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter age:");
int mark = sc.nextInt();
if(mark>=40){
System.out.print("Pass")
}
else{
System.out.print("Fail")
}
}
}