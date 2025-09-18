#include <bits/stdc++.h>
using namespace std;
int main()
{

int n;
cin >> n;

int mat[n][3];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        cin >> mat[i][j];
    }
}
int s = 0;
int problem = 0;
for(int i=0;i<n;i++){
s = 0;
    for(int j=0;j<n;j++){
        s+=mat[i][j];
    }

    if(s>=2) problem++;
}
 cout << problem;





    return 0;
}