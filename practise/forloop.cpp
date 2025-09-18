#include <bits/stdc++.h>
using namespace std;
int  main(){

// for(int i=1;i<=10;i++){
//     cout <<"Hello World" << endl;
// }


//Write a C++ program to print all alphabets from a to z. – using for   loop


//n user se lena hah 

//1 to n ka sum niklana hh 
//5
//1 + 2 + 3 + 4 + 5 = 15 






//Write a C++ program to count number of digits in a number.




//123 
// ans - 3


//Write a C++ program to calculate sum of digits of a number.

//123 
//1 + 2 + 3 = 6

//982 
// 19




//count of number



//college there are girls and boys
//lets some unique regno
//unique regno count of no digits  odd - girls and even - boys 



//1234

//last digit is 4
//first digit is 1






//rev a number  123
//321



int n;
cin >> n;//123
int rev = 0;//0
while(n!=0){
    int k = n%10;//1
    rev = rev*10 + k;//30 + 2 = 320 + 1
    n = n/10;//0
}


cout << rev;



    return 0;
}