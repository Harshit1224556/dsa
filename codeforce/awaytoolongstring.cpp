#include <bits/stdc++.h>
using namespace std;
string modifiedstring(string s){
       if(s.length()<=10){
        return s;
       }

       string result = "";
       int n = s.length()-2;
       result+=s[0];
       result+=to_string(n);
       result+=s[s.length()-1];
       
       return result;
}
int main()
{


int  n;
cin >> n;
string s;

for(int i=1;i<=n;i++){
    cin >> s;
    cout<<modifiedstring(s) << endl;
    
}

    return 0;
}