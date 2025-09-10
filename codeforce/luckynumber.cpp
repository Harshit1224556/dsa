#include <bits/stdc++.h>
using namespace std;

bool  islucky(long long  n){

while(n!=0){

    if(n==0) return false;
    int k = n%10;
    if(k!=4 && k!=7) return false;
    n=n/10;
}
return true;
}

int noofluckynumber(string  n){
     int c  = 0;
     for(int i=0;i<n.length();i++){
        if(n[i]=='4'||n[i]=='7') c++;
     }
   
    return c;
}

string nearluckynumber(string  n){
    int cl = noofluckynumber(n);
    if(islucky(cl)) return "YES";
    else
    return "NO";
}

int main(){
string n;
cin >> n;
cout  << nearluckynumber(n);
    return 0;
}