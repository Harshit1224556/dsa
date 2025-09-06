import java.util.*;
public class kthmissingno {
     public static void main(String[] args) {
        
      
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
 
   int k = sc.nextInt();

System.out.println(missingno(arr, k));



    }


    public static int missingno(int arr[],int k){
        ArrayList<Integer> msarr= new ArrayList<>();
        for(int j=1;j<arr[arr.length-1];j++){
            int isfound = 0;
        for(int i=0;i<arr.length;i++){
                if(j==arr[i]){
                     isfound = 1;
                }
            }
            if(isfound==0) msarr.add(j);
        }

        return msarr.get(k-1);
    }
}
