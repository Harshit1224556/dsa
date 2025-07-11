import java.util.*;
public class buystock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        
        int max = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int profit = arr[j]-arr[i];
                if(profit>max) max = profit;
            }
        }
     
        System.out.println(max);
        
    }
}

//for optimal use math.min and then compare the difference between them using min and arr[i]

// int max  = 0;
//int maxPro = 0;
    // int minPrice = Integer.MAX_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    //     minPrice = Math.min(minPrice, arr[i]);
    //     maxPro = Math.max(maxPro, arr[i] - minPrice);
    // }
    // return maxPro;
    // }
