import java.util.*;
public class kokoeatingbanana {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];


    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    
   int h = sc.nextInt();
    System.out.println(minspeed(arr, h));

    }

    public static int max(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }

    public static int  totalhour(int arr[],int hours){
        int th = 0;
        for(int i=0;i<arr.length;i++){
         double sh = Math.ceil((double)arr[i] / hours); 
            th += (int)sh;
        }
        return th;
    }

    public static int minspeed(int arr[],int h){

        int low = 1;
        int high = max(arr);
        while(low<=high){
            int mid = (low + high)/2;

            int th = totalhour(arr, mid);
            if(th<=h){
                high = mid-1;
            }

            else{
                low = mid+1;
            }
        }
        return low;
    }
}
