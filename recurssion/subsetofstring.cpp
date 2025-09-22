#include <bits/stdc++.h>
using namespace std;
void printsubset(string res,string s,int ind){
    if(ind==s.length()){
        cout << res << endl;
        return;
    }
    char  ch = s[ind];
    printsubset(res+ch,s,ind+1);
    printsubset(res,s,ind+1);
}

int main()
{
    string s;
    cin>>s;
    printsubset("",s,0);
    return 0;
}
