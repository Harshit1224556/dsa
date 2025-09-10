#include <bits/stdc++.h>
using namespace std;
int climbstairs(int n){
    if(n==1) return 1;
    if(n==2) return 2;
    return climbstairs(n-1) + climbstairs(n-2);
}

//if three climbs possible we just three base case
int main(){
int n;
cin >> n;
cout << climbstairs(n);



    return 0;
}