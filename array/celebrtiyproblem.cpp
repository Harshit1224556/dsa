#include <bits/stdc++.h>
using namespace std;
int main()
{

int row,col;
cin >> row>>col;

int mat[row][col];
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        cin>>mat[row][col];
    }
}

unordered_map<int,int> s;
for(int i=0;i<row;i++){
   s[i] = 0;
}


for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        
      if(i!=j){
          if(mat[i][j]==1){
             s.erase(i);
             s[j]++;
          }
      }


    }
}

for(auto it:s){
    if(it.second==2){
        return it.first;
    }
}

return -1;






    return 0;
}