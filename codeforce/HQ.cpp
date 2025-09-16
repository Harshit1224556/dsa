#include <bits/stdc++.h>
using namespace std;
int main()
{

string s;
cin >> s;
int isoutput = 0;
for(int i=0;i<s.length();i++){

    if(s[i]=='H'||s[i]=='9'||s[i]=='Q') isoutput = 1;
}
if(isoutput==1){
    cout << "YES";
}
else{
    cout << "NO";
}
    return 0;
}