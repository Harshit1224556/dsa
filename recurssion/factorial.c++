#include <bits/stdc++.h>
using namespace std;
int factorial(int n){
    if(n==1) return 1;
    int fac = factorial(n-1)*n;
    return fac;
}
int main(){
   int n;
   cin >> n;
   cout << factorial(n);

    return 0;
}