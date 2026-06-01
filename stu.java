class stu
{
    public static void main(String[] args)
    {
        int[] arr = {75,60,80,30,50};

        int largest = arr[0];
        int avg = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
        int failed = 0;

        for(int n : arr)
        {
            if(n > largest)
            {
                largest = n;
            }
            if(n<35){
                failed++;
                
            }
           
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Average = "+avg);
        System.out.println("count : "+ failed);
    }
}