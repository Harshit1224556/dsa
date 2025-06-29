import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      // enter the size of the array
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
    //input - 1 1 2 2 3 3 4
    //output - 1 2 3 4
      int j = 0;
    for(int i=1;i<n;i++){
        if(arr[i]!=arr[j]){
            arr[j++] = arr[i];
        }
    
    }
     
   System.out.println(j);
    }

}
