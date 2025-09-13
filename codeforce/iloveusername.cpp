#include <bits/stdc++.h>
using namespace std;
int main(){

int n;
cin >> n;
int arr[n];
for(int i=0;i<n;i++){
    cin >> arr[i];
}


int maxscore  = arr[0];
int minscore = arr[0];


int amazing = 0;
for(int i=1;i<n;i++){
    if(arr[i]>maxscore) {
        maxscore = arr[i];
        amazing++;
    }
    if(arr[i]<minscore){
        minscore = arr[i];
        amazing++;
    }
}
cout << amazing;



    return 0;
}