
import java.util.*;
public class min {
    public static void main(String[] args) {
        

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];

for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}


System.out.println(minimun(arr));



    }



    static  int minimun(int arr[]){
     
        int n  = arr.length;
        int low = 0;
        int high = n-1;
        int min = Integer.MAX_VALUE;

       while(low<=high){
         
          int mid = (low + high)/2;

          if(arr[low]<=arr[mid]){
            min = Math.min(min,arr[low]);
            low = mid + 1;
       }
       else{
            min = Math.min(min,arr[mid]);
            high = mid - 1;
        
       }

    }

        return min;
    }
}
