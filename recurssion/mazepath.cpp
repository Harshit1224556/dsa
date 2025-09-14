#include <bits/stdc++.h>
using namespace std;

int uniquepath(int sr,int sc,int er,int ec){

    if(sr>er||sc>ec) return 0;
    if(sr==er && sc==ec) return 1;
   int righway  = uniquepath(sr,sc+1,er,ec);
   int bottomway = uniquepath(sr+1,sc,er,ec);
     return righway + bottomway;
}


//lets solve leetcode style 

int uniquepath(int m,int n){

    if()
    int r = uniquepath(m,n-1);
    int l = uniquepath(m-1,n);
}
int main()
{
//    cout <<  uniquepath(0,0,2,2);







    return 0;
}