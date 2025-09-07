import java.util.*;
public class aword {
    
    public static void main(String[] args) {
        
          
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         int ub = 0;
         int lb = 0;
        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c)) ub++;
            else lb++;
        }
        
        if(ub>lb){
            System.out.println(s.toUpperCase());
        }
      
        else{
            System.out.println(s.toLowerCase());
        }

    }

}
