#include <bits/stdc++.h>
using namespace std;

void maxelement(int arr[],int n,int ind,int max)
{
    
    if(ind == n) {
        cout << max;
        return;
    }
      if(arr[ind]>max) max = arr[ind];
      maxelement(arr,n,ind+1,max);


}
int main()
{

int n;
cin >> n;
int arr[n];
for(int i=0;i<n;i++)
{
    cin >> arr[i];
}

maxelement(arr,n,0,INT_MIN);




    return 0;
}