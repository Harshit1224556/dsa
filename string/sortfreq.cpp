#include <bits/stdc++.h>
using namespace std;
int main(){


string s;
cin >> s;
map<char,int> freq;
for(char c:s){
    freq[c]++;
}
string result = "";
for(auto it:freq){
    for(int i=1;i<=it.second;i++){
        result+=it.first;
    }
}
cout << result;

    return 0;
}