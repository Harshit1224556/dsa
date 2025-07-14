
import java.util.*;
public class twosum2 {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
      int result[] = twosum(arr, target);
      for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
      }
    }

    public static int[] twosum(int [] arr,int target){
        //brute force approach
        int count[] = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count[0]=i+1;
                    count[1]=j+1;
                }
            }
        }

        return count;
    }
}
