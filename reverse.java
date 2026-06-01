import java.util.Scanner;
class reverse{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int d = 0;
while(a>0){
int c = a%10;
d = d*10 + c;
a = a/10;
}
System.out.print(d);
}
}
