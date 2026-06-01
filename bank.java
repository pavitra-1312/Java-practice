import java.util.Arrays;
import java.util.Scanner;
class bank{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of transactions:");
int n = sc.nextInt();
int[] amt = new int[n];
for(int i=0;i<n;i++){
System.out.println("Enter the amount:");
amt[i] = sc.nextInt();
}
int withdrawal = 0;
int sum = 0;
int max=0;
for(int k:amt){
sum+=k;
if(k<0){
withdrawal++;}
if(k>max){
max=k;}
}
System.out.println("Final Balance:"+sum);
System.out.println("No. of Withdrawals:"+withdrawal);
System.out.println("Largest Transaction:"+max);
}
}