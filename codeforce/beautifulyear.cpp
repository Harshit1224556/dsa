#include <bits/stdc++.h>
using namespace std;

bool isdistinct(int n){
    vector <int> s;
    
    while(n!=0){
        int k = n%10;
        s.push_back(k);
        n = n/10;
    }

    set <int> un;

    for(int x: s){
        if(un.count(x)){
            return false;
        }
        else{
            un.insert(x);
        }
}

return true;
}
int main()
{

int n;
cin>>n;


int s= n+1;
while(1)
{

    if(isdistinct(s)){
        cout << s;
        break;
    }
    else{
        s++;
    }
}



    return 0;
}