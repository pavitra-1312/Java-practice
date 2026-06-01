import java.util.Scanner;
public class compareString{
public static void main(String[] args){
Scanner s = new Scanner(System.in){
System.out.println("Enter the sentence: ");
String d = s.nextLine();
System.out.println("Enter the sentence: ");
String e = s.nextLine();
if(d.equals(e)){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}