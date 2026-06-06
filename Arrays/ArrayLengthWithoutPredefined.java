import java.util.Scanner;

public class ArrayLengthWithoutPredefined {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter " + size + " elements of array:: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count++;
        }
        System.out.println("Length of array is: " + count);
    }
}