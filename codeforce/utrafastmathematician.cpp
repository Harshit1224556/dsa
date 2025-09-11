#include <bits/stdc++.h>
using namespace std;
int main(){


string s1,s2;
cin >> s1 >> s2;

string result = " ";
for(int i=0;i<s1.length();i++){
    int bit1 = s1[i] -'0';
    int bit2 = s2[i]- '0';
    int bit3 = bit1^bit2;
    result+=(bit3 + '0');

}
cout << result;






     return 0;
}