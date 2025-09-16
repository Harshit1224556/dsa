#include <bits/stdc++.h>
using namespace std;
int main()
{



string s1,s2;
cin >> s1 >> s2;



for(char &x:s1){
    x = tolower(x);
}
for(char &x:s2){
    x = tolower(x);
}

if(s1==s2){
    cout << "0";
}
else if(s1>s2)
cout << "1";
else
cout << "-1";
    return 0;
}