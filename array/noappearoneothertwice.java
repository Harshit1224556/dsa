package array;
import java.util.*;
public class noappearoneothertwice {
    public static void main(String[] args) {
        
        //input - 1 1 2 2 3
        //output -3 
        //everyone other no appear twice except this 3 thats appear only once 

        int bin = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            bin = bin^arr[i];
        }
        System.out.println(bin);
    }
}
