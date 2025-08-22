// package sorting;

import java.util.*;

public class bubble {


   public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
 
int n  = sc.nextInt();
int arr[] = new int[n];


for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}

selectionesort(arr);
print(arr);

   }

   public static void selectionesort(int arr[]){
    
    int n = arr.length;

   
     for(int i=0;i<n-1;i++){
        int min = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
     }


   }
    
   public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);

    }
   }

}

