import java.util.Scanner;
public class switchtraffic{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the alphabet(r/y/g): ");
char colour = sc.next().charAt(0);
char r = '1';
char y = '2';
char g = '3';
switch(colour){
case 1:
System.out.println("Stop");
break;
case 2:
System.out.println("Wait");
break;
case 3:
System.out.println("Go");
break;
default :
System.out.println("Invalid letter");
}
}
}
