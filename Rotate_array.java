import java.util.*;
public class Rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a val how many time you want to rotate");
        int val = sc.nextInt();
       
        System.out.println("rotated array");

        for(int i = 0 ; i<val;i++){

        int store = arr[0];
        for(int j = 0 ; j<n-1 ; j++){
            arr[j] = arr[j+1];
        }
         arr[n-1] = store;

    }
          for(int ele : arr){
            System.out.println(ele + " ");
          }
        
    }
  
}
