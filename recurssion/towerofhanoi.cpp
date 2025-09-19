#include <bits/stdc++.h>
using namespace std;
void towerofhanoi(int n,char a,char b,char c)
{
     if(n==0) return;
    towerofhanoi(n-1,a,c,b);
    cout << a << " " << c << endl;
    towerofhanoi(n-1,b,c,a);
}
int main()

{

    towerofhanoi(3,'a','b','c');




    return 0;
}