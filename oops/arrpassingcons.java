// package oops;
import java.util.*;

class arrayconcatenor{
    
int arr1[];
int arr2[];
arrayconcatenor(int arr1[],int arr2[]){
    this.arr1=arr1;
    this.arr2=arr2;
}

void printarraycon(){
    
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
    }
    for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i] + " ");
    }
}

}


public class arrpassingcons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();

        }
        
       arrayconcatenor a1 = new arrayconcatenor(arr1, arr2);
       a1.printarraycon();
       
    }
}
