#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin >> s;

set<char> st;
for(char x: s){

    st.insert(x);
}
int n = st.size();
if(n%2!=0){
    cout << "IGNORE HIM!";
}
else{
    cout << "CHAT WITH HER!";
}
    return 0;
}