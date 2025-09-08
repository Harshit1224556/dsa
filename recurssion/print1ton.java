

import java.util.*;
public class print1ton {
    public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
int n = sc.nextInt();
print(5,1);



    }

    public static void print(int n,int start){
            
        System.out.println(start);
        if(n==start) return;
        print(n,start+1);
        
    }
}

//firsly done n to 1

//firstly print 1 to n