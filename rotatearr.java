import java.util.*;
public class rotatearr {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        
        print(arr);

    }
    public static void reverse(int arr[],int s,int e){
         while(s<=e){
             int temp = arr[s];
             arr[s]=arr[e];
             arr[e]=temp;
             s++;
             e--;
         }

    }
 public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
 }

}

