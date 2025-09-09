#include <bits/stdc++.h>
using namespace std;

bool ismorphicstring(string s,string t){
unordered_map <char,char> mst;
unordered_map <char,char> mts;
if(s.length()!=t.length()) return false;
if(s.length()==0) return true;

for(int i=0;i<s.length();i++){

int c1 = s[i];
int c2 = t[i];
if(mst.count(c1)){
    if(mst[c1]!=c2) return false;
    else
    mst[c1]=c2;
}
if(mts.count(c2)){
     if(mst[c2]!=c1) return false;
    else
    mst[c2]=c1;
}
    

}
return true;
}
int main(){


string s,t;
cin >>s;
cin>>t;

cout << ismorphicstring(s,t);



    return 0;
}