#include <bits/stdc++.h>
using namespace std;

int uniquepath(int sr,int sc,int er,int ec){

    if(sr>er||sc>ec) return 0;
    if(sr==er && sc==ec) return 1;
   int righway  = uniquepath(sr,sc+1,er,ec);
   int bottomway = uniquepath(sr+1,sc,er,ec);
     return righway + bottomway;
}

void  printpath(int sr,int sc,int er,int ec,string s){

    if(sr>er||sc>ec) return;
    if(sr==er && sc==ec){
        cout << s << endl;
        return;
    }
   printpath(sr,sc+1,er,ec,s+'R');
   printpath(sr+1,sc,er,ec,s+'D');
    
}


//we can also do this code by using two parameters

int uniquePaths(int m,int n){
    if(m<0 || n<0) return 0;
    if(m==1 && n==1) return 1;
    uniquePaths(m-1,n) + uniquePaths(m,n-1);
}


int main()
{
printpath(0,0,2,2,"");
 return 0;
}