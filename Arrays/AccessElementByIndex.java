import java.util.Scanner;   

public class AccessElementByIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index of element you want to access: ");
        int index=sc.nextInt();

        if(index >= 0 && index < size){
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } 
        else{
            System.out.println("Index out of bounds");
        }
    }
}