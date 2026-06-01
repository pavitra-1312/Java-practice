import java.util.Scanner;
class evenseries{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the end number: " );
int end = sc.nextInt();
for(int i = 2; i <= end; i += 2){
int result = i;
System.out.print(result+" ");
}
}
}
