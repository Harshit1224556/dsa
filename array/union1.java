package array;
import java.util.*;
public class union1 {
public static void main(String[] args) {
    

//union of the two array
//input 
//arr1- 1,2,3,4,5
//arr2 - 1,3,5,6,4
//output-1,2,3,4,5,6

Scanner sc = new Scanner(System.in);

//enter the first array element
int n1 = sc.nextInt();
int arr1[] = new int[n1];
for(int i=0;i<n1;i++){
    arr1[i]=sc.nextInt();
}

//enter the second array element
int n2 = sc.nextInt();
int arr2[] = new int[n2];
for(int i=0;i<n2;i++){
    arr2[i]=sc.nextInt();
}

int c=0;
int result[] = new int[n1+n2];
for(int i=0;i<n1;i++){
    result[i]=arr1[i];
    c++;
}

for(int i=0;i<n2;i++){
    for(int j=0;j<n1;j++){
        if(arr2[i]==arr1[j]){
           arr2[i]=-1;
        }
    }
}


for(int i=0;i<n2;i++){
    if(arr2[i]!=-1){
        result[c++]=arr2[i];
        
    }
}


for(int i=0;i<c;i++){
    System.out.println(result[i]);
}

}
}
