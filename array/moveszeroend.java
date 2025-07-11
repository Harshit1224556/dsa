package array;
import java.util.*;
public class moveszeroend {
    public static void main(String[] args) {

        //input = 0 1 2 0 3 0 0
        //output = 1 2 3 0 0 0 
        
        
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       //taken the input
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

       //make a new array 
        int pos = 0;
        int count = 0;
       int result[] = new int[n];
       for(int i=0;i<n;i++){
        if(arr[i]!=0){
            result[pos++]=arr[i];
            count++;
        }
       }

       for(int i=1;i<=n-count;i++){
              result[pos++] = 0;
       }
       
       for(int i=0;i<n;i++){
        System.out.println(result[i]);
       }
    }
}
