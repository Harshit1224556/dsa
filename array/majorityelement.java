package array;
import java.util.*;
public class majorityelement {
    public static void main(String[] args) {
        

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //enter the elements of the array
      int arr[] = new int[n];

      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

          int c= 0;
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(arr[i]==arr[j]) c++;
            if(c>(n/2)) {
                System.out.println(arr[i]);
                break;
            }
        }
      }
    }
}
