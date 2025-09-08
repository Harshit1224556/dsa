import java.util.*;
public class assigncookies {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int g[] = new int[n1];
    for(int i=0;i<n1;i++){
        g[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int s[] = new int[n2];
    for(int i=0;i<n2;i++){
        s[i] = sc.nextInt();
    }
     int start = 0;
     int c = 0;
    for(int i =0;i<n2;i++){
        for(int j=start;j<n1;j++){
            if(s[i]>=g[j]){
                c++;
                start++;
                if(start>=n1) break;
            }
        }
    }

    System.out.println(c);

  }

}
