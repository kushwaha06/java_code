import java.util.*;
public class largest{
    public static int third(int arr[] , int n){
       return arr[n-3];
    }
    public static void main(String[] args) {
        int arr[] =  {5,1,3,4,8};
        int n = arr.length;
       Arrays.sort(arr);
        System.out.println("ans is" + " " + third(arr, n));
    }
}
