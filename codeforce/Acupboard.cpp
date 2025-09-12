#include <bits/stdc++.h>
using namespace std;
int main(){

int n;
cin >> n;
int ld,rd;
int cld0 = 0;
int cld1 = 0;
int crd0 = 0;
int crd1 = 0;
for(int i=1;i<=n;i++){
    cin >> ld >> rd;
    if(ld==0) cld0++;
    else cld1++;
    if(rd==0) crd0++;
    else crd1++;
}

int time,lt,rt;

if(cld0>cld1) {
    lt = n-cld0;
}

else{
    lt = n-cld1;
}

if(crd0>crd1){
    rt = n - crd0;
}

else{
    rt = n - crd1;
}

time = lt+rt;
cout << time;


    return 0;
}