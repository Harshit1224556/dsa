package array;
import java.util.*;
public class longestsumsubarray {
    public static void main(String[] args) {
        
    
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int arr[] = new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          
          int k = sc.nextInt();
        //     int max = 0;
        //    int s = 0;
        //    int c = 0;
        //   for(int i=0;i<n;i++){
        //     s = 0;
        //     for(int j=i;j<n;j++){
        //            s= s+arr[j];
        //            if(s==k){
        //               c = j-i+1;
        //               if(c>max)
        //               max = c;
        //            }
        //     }
        //   }

        //   System.out.println(max);

        //good complexity now its time to swithc to best time complexity 

        //lets reduce it to o(n) time complexity

        // int s = 0;

        // for(int i=0;i<n;i++){

        //     s = s + arr[i];


        // }


    }
}
