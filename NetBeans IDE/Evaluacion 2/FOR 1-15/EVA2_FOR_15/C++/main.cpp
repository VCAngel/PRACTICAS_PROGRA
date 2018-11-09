#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "Introduce un numero:" << endl;
    int iNum, iCont, i;
    
    cin >> iNum;
    iCont = 0;
    for (i = 1; i <= iNum; i++) {
        int iMod;
        
        iMod = iNum % i;
        if (iMod == 0) {
            iCont = iCont + 1;
        }
    }
    if (iCont <= 2) {
        cout << "Es primo" << endl;
    } else {
        cout << "No es Primo" << endl;
    }
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}
