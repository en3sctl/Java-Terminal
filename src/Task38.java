package c08;

public
    class Task38 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 8, 6};

        int evenCount = 0;
        for(int i=0; i < arr.length; i++)
            if(arr[i] % 2 == 0)
                evenCount++;

        int[] brr = new int[evenCount];
        for(int i=0; i < arr.length; i++)
            if(arr[i] % 2 == 0)
                brr[--evenCount] = arr[i];

        System.out.print("[");
        for(int val : brr)
            System.out.print(" "+val);
        System.out.println("]");
    }
}
