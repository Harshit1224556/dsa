#include <bits/stdc++.h>
using namespace std;

int power(int a,int b){
    // int pow = 1;
    // for(int i=1;i<=b;i++){
    //     pow = pow*a;
    // }
    // return pow;
   if(b==1) return 1;
    return a*pow(a,b-1);
}
int main(){
   int a;
   cin >> a;
   int b;
   cin>>b;
   cout << pow(a,b);
    return 0;
}