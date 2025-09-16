#include <bits/stdc++.h>
using namespace std;
int main()
{


int n, k, l, c, d, p, nl, np;
cin >> n >> k >> l >> c >> d >> p >> nl >> np;
int tl = (l*k);
int tc =  (c*d);



int dt = tl/(n*nl);
int lt = tc/(n);


int st = p/(n*np);


int min1 = min(dt,lt);
int toast = min(min1,st);
cout << toast;


    return 0;
}