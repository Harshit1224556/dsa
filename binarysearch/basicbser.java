// package binarysearch;
import java.util.*;

public class basicbser {
    
    public static void main(String[] args) {
        
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];


        for(int i=0;i<n;i++){
          
            arr[i] = sc.nextInt();
        }
          
        int target = sc.nextInt();
       System.out.println(binary(arr, target));

    }

  public static int binary(int arr[],int target){
    int n = arr.length;
        int low = 0;
        int high = n-1;
   

        while(low<=high){

                 int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;

            else if(arr[mid]>target) high = mid-1;
            else if(arr[mid]<target) low = mid +1;

          

        }

       

    return -1;
  }
}


//logn complexity
