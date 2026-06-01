import java.util.Arrays;
import java.util.Scanner;
class attendance{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter no.of days:");
int n = sc.nextInt();
int[] day = new int[n];
for(int i=0;i<n;i++){
System.out.println("Enter: Present - 1 / Absent - 0");
day[i]=sc.nextInt();
}
int count = 0;
int total = day.length;
for(int k:day){
if(k==1){
count++;}
}
System.out.println("Total Present:"+count);
System.out.println("Total Absent:"+(total-count));
double percentage = ((double)count/total)*100;
System.out.printf("Attendance Percentage:"+percentage);
}
}