#include <bits/stdc++.h>
using namespace std;
int maxelem(int arr[],int n,int ind)
{
    if(ind == n) return INT_MIN;
    return max(arr[ind],maxelem(arr,n,ind+1));
 
}

int main()
{

int n;
cin>>n;
int arr[n];
for(int i=0;i<n;i++)
{
    cin>>arr[i];
}

cout << maxelem(arr,n,0);

    return 0;
}