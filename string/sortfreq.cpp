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

    // for(int i=1;i<=it.second;i++){
    //     result+=it.first;
    // }

    while(!freq.empty()){
        char maxChar;
        int maxfreq = 0;
        for(auto it:freq){
            if(it.second>maxfreq){
                
                maxChar=it.first;
                maxfreq= it.second;
            }
        }
        for(int i=0;i<maxfreq;i++){

            result+=maxChar;
        }
        freq.erase(maxChar);

    }

    

cout << result;

    return 0;
}



