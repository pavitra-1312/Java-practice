import java.util.Arrays;
import java.util.Scanner;
class temperature{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of values:");
int n = sc.nextInt();
int[] temp = new int[n];
for(int i=0;i<n;i++){
System.out.println("Enter temperature:");
temp[i] = sc.nextInt();
}
int max = temp[0];
int min = temp[0];
int sum = 0;
for(int k:temp){
if(k>max){
max=k;}
if(k<min){
min=k;}
sum+=k;
}
System.out.println("Highest Temperature:"+max);
System.out.println("Lowest Temperature:"+min);
System.out.println("Average Temperature:"+(sum/temp.length));
}
}