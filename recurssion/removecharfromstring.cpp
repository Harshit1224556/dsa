#include <bits/stdc++.h>
using namespace std;
void removechar(string result,string org){

    if(org.length()==0){
        cout << result;
        return;
    }
    char ch = org[0];
    if(ch=='a') removechar(result,org.substr(1));
    else removechar(result+ch,org.substr(1));
}

int main()
{
string str = "harshit sharma";

removechar("",str);

    return 0;
}