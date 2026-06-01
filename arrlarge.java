class arrlarge
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};

        int largest = arr[0];

        for(int n : arr)
        {
            if(n > largest)
            {
                largest = n;
            }
        }

        System.out.println("Largest number = " + largest);
    }
}