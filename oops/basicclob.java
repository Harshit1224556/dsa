import java.util.*;
class Student{
    int rno;
    String name;
   Student(int rno,String name){
    this.rno=rno;
     this.name = name;

   }
   public void print(){
       System.out.println("my name is " + name);
       System.out.println("my roll number is " + rno);
   }

    
}
public class basicclob {
    public static void main(String[] args) {
        
       Student s1 = new Student(12,"Harshit");
       s1.print();
    }

}
