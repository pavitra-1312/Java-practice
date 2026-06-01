import java.util.Scanner;
public class countvowels{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the String: ");
String n = s.nextLine().toLowerCase();
int count =0;
for(int i = 0; i<n.length(); i++){
char ch = n.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
count++;
}
}
System.out.println(count);
}
}