
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k = sc.nextInt();

         
        //1 varaint 
        int isfound = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]+arr[j]==k){
                    isfound = 1;
                }
            }
        }
  
        if(isfound==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
     
    }
}
