package c08;

public
    class Task0802 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5};

        for(int i=0; i < arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length/2+i];
            arr[arr.length/2+i] = tmp;
        }
        System.out.print("[");
        for(int val : arr)
            System.out.print(" "+val);
        System.out.println("]");
    }
}
