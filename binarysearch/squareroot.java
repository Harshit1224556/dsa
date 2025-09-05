
import java.util.*;
public class squareroot {
    public static void main(String[] args) {
        
  

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(squareroots(n));
}


public static int squareroots(int n){


int low = 0;
int high=n;
int ans = 1;
while(low<=high){
    int mid = (low+high)/2;

    if(mid*mid<n){
        ans = mid;
        low = mid + 1;
    }
    else{
        high  = mid -1;
    }

}
    return ans+1;
}
  }