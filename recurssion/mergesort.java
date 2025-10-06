public class mergesort {
    public static void main(String[] args) {
        

int arr[]={5,2,1,3,4,8,7,6};


mergesortss(arr);
print(arr);



    }


    public static void mergesortss(int arr[]){

        if (arr.length <= 1) return;
        int n = arr.length;
        int a[] = new int[n/2];
        int b[] = new int[n-(n/2)];
        int ind =  0;

        for(int i=0;i<a.length;i++){
            a[i] = arr[ind++];
        }

        for(int i=0;i<b.length;i++){
            b[i] = arr[ind++];
        }

        mergesortss(a);
        mergesortss(b);
        merge(a, b, arr);
        

    }
 
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int a[],int b[],int c[]){
       
        
        int i =0;
        int j = 0;
        int k = 0;

        while(i<a.length && j<b.length){
               
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
            

        }
         while(i<a.length) c[k++] = a[i++];
             while(j<b.length) c[k++] = b[j++];

    }
}
