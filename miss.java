public class miss{
public static void main(String[] args){
int[] arr = {1,2,3,5};
int n = 5;
int expectedsum = n*(n+1)/2;
int actualsum = 0;
for(int num: arr){
actualsum += num;
}
int missing = expectedsum - actualsum;
System.out.println("Missing number = "+missing);
}
}