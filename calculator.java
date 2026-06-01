import java.util.Scanner;
class calculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = sc.nextInt();
System.out.println("Enter second number: ");
int b = sc.nextInt();
System.out.println("Enter operator(+,-,*,/,%): ");
String operator = sc.next();
switch(operator){
case "+":
System.out.println(a+b);
break;
case "-":
System.out.println(a-b);
break;
case "*":
System.out.println(a*b);
break;
case "/":
System.out.println(a/b);
break;
case "%":
System.out.println(a%b);
break;
default :
System.out.println("Invalid symbol");
}
}
}
