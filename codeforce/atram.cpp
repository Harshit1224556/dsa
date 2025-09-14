#include <bits/stdc++.h>
using namespace std;
int main(){


int n;
cin >> n;
int a,b;
int s = 0;
int max = 0;
for(int i=1;i<=n;i++){
    cin >> a >> b;
    s = s - a + b;
    if(s>max) max = s;

}

cout << max;


    return 0;
}