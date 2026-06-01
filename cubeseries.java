import java.util.Scanner;
class cubeseries{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the end number: " );
int end = sc.nextInt();
for(int i = 1; i <= end; i++){
int result = i*i*i;
System.out.print(result+" ");
}
}
}
