public class ArrayEle{
    public static void main(String[] args){
        int arr[] = {3, 6, 9, 10, 15, 33, 12};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println("Number of elements divisible by 3: " + count);
}
}


