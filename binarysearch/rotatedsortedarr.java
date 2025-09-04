import java.util.*;
public class rotatedsortedarr {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

         int target = sc.nextInt();
       
         System.out.println(search(arr, target));

    }


   static  int search(int arr[],int target){
  
int low = 0;
int high = arr.length-1;


//if it is duplicates what we have to do is just remove the duplicates
//we have to toggle these condition where arr[low] == arr[mid] == arr[high] just do low-- and high -- and continue
while(low<=high){
    int mid = (low+high)/2;
    if(arr[mid]==target) return mid;
    if(arr[low]<=arr[mid]){
          
        if(arr[low]>=target && arr[mid]<=target){
            high = mid -1;
        }
        else{
            low = mid + 1;
        }
    }

else{


     if(arr[mid]>=target && arr[high]<=target){
            low = mid +1;
        }
        else{
              high = mid -1;
        }


}
    

}
return -1;
    }
}
