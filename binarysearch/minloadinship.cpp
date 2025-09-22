#include <bits/stdc++.h>
using namespace std;

int maxelem(int arr[],int n)
{
    int macs = arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>macs) macs = arr[i];
    }

    return macs;
}

int sumofarr(int arr[],int n){
    int s = 0;
    for(int i=0;i<n;i++){
        s = s+arr[i];
    }

    return s;
}

int  isabletoship(int arr[],int mid,int n){
    int s = 0;
    int daycount = 1;
    for(int i=0;i<n;i++){
        if(s+arr[i]>mid){
            s=arr[i];
            daycount = daycount+1;
        }
        else{
            s = s+ arr[i];
        }
    }

    return daycount;
}
int main(){
  
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int d;
    cin>>d;
  int low = maxelem(arr,n);
  int high = sumofarr(arr,n);
  int ans = high;
  while(low<=high)
  {
    int mid = low + (high-low)/2;
    if(isabletoship(arr,mid,n)>d){
        
        low  = mid+1;
    }
    else if(isabletoship(arr,mid,n)<=d){
          ans = mid;
          high = mid-1;
    }
  
  }

  cout << ans;

    return 0;

}