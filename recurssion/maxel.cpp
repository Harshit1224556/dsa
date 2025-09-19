#include <bits/stdc++.h>
using namespace std;

void  maxs(int arr[],int n,int max,int ind){
    if(n==ind){
        cout << max;
        return;
    }
    if(arr[ind]>max) max = arr[ind];
    maxs(arr,n,max,ind+1);
   
}
int main()
{

    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

  maxs(arr,n,arr[0],0);



    return 0;
}