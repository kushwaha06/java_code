import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i<n ;i++){
                arr[i] = sc.nextInt();
            }
      // creating a dummy array named as frequency;

      int []frequency = new int[n];
      int visited = -1;
      for(int i = 0 ; i<n ;i++ ){
      int count = 1;
             for(int j = i+1 ; j<n ;j++){

              if(arr[i] == arr[j]){
               count++;

               // to avoid counting same element again set
               frequency[j] = visited;

              }

             }
     
             if(frequency[i] != visited){
                frequency[i] = count;
              }

      }
// printing the element;

 for(int i = 0 ; i < frequency.length ;i++){
   if(frequency[i] != visited){
                System.out.println(" " + arr[i] + "|"  +frequency[i]);
   }
   // System.out.println();
 }
        }
    }
    
}