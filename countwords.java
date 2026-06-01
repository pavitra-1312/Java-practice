import java.util.Scanner;
public class countwords{
public static void main(String[] args){
Scanner s = new Scanner(System.in){
System.out.println("Enter the sentence: ");
String d = s.nextLine();
String[] words = d.trim().split("\\s+");
System.out.println(words.length);
}
}