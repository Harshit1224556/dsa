import java.util.*;
public class kadanealgo {
    public static void main(String[] args) {
        //max subarray sum
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       
        int s = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            s = s + arr[i];
            if(s<0) s = 0;
            if(s>max) max = s;
        }
     
       System.out.println(max);


    }
}

//max subarray sum m hum kadane algorith use krte hah jisme ye concept hah aage ki negative sum aage le jaane ki ky technique hahh