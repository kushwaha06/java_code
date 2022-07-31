
import java.util.*;
public class right_rotate {
    
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of rotation");
        int val = sc.nextInt();
        for(int i = 0 ; i < val ; i++){

        int store = arr[n-1];
        for(int j = n-1 ; j > 0 ; j--){
            arr[j] = arr[j-1];
        }
        arr[0] = store;
    }
     System.out.println("right rotated array");
        for(int ele : arr){
            System.out.println(ele +" ");
        }
    }
    }
}
