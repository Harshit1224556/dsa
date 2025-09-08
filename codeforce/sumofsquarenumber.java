import java.util.*;
public class sumofsquarenumber {
    
    public static void main(String[] args) {
        

Scanner sc  = new Scanner(System.in);
int n = sc.nextInt();


System.out.println(istriplet(n));



    }

    public static boolean  istriplet(int n){



// int low = 0;
// int high = n/2;

// for(int i=low;i<=high;i++)
// {
//     for(int j=i+1;j<=high;j++){
//         if(((i*i) + (j*j))==n) return true;

        
//     }
// }


// return false;


//5 
//thats may be the brute force approach now lets move to the optimal approach


//



int low = 0;
int high = (int)Math.sqrt(n);

while(low<=high){

   int  s   = low*low + high*high;
   if(s==n) return true;
   else if(s>n) high--;
   else if(s<n) low++;
}




 return false;

        
    }
}
