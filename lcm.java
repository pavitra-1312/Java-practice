import java.util.Scanner;
class lcm{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  number: " );
int a = sc.nextInt();
System.out.println("Enter the  number: " );
int b = sc.nextInt();
int i,j;
while(a>0 && b>0)
{
for(i = 1; i<=a; i++)
{
if(a%i == 0)
{
int result1 = i;
System.out.println(result1+" ");
continue;
}
for(j = 1; j<=b; j++)
{
if(b%j == 0)
{
int result2 = j;
System.out.println(result2+" ");

continue;
}
}
}
}
}
}