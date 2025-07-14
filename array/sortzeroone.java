import java.util.*;
public class sortzeroone {
   public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      int arr[] = new int[n];

      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      sortoneandzero(arr);
      print(arr);
   } 

   public static void print(int arr[]){
    int n  = arr.length;
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
   }

   public static void sortoneandzero(int arr[]){
      
     int n = arr.length;
     int l = 0;
     int r  = n-1;
     while(l<r){
         
        if(arr[l]==0){
            l++;
        }
        else if(arr[r]==1){
            r--;
        }
        else{
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
            
        }

     }

   }
}
