import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
     
        bubblesorts(arr);
        printarr(arr);
      
        

    }


    public static void bubblesorts(int arr[]){
int n = arr.length;
     
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
           
                if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }

    }


    // public static void swap(int a,int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }


    public static void  printarr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
          System.out.println(arr[i]);
        }
    }

}
