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
    int iNum1, iDen1, iNum2, iDen2, iCNSum, iCNRes, iCNPro, iCNDiv, iCDDiv, iCD;
    
    cout << "Numerador 1 = ";
    cin >> iNum1;
    cout << "Denominador 1 = ";
    cin >> iDen1;
    cout << "Numerador 2 = ";
    cin >> iNum2;
    cout << "Denominador 2 = ";
    cin >> iDen2;
    iCNSum = iNum1 * iDen2 + iDen1 * iNum2;
    iCNRes = iNum1 * iDen2 - iDen1 * iNum2;
    iCNPro = iNum1 * iNum2;
    iCNDiv = iNum1 * iDen2;
    iCDDiv = iNum2 * iDen1;
    iCD = iDen1 * iDen2;
    cout << iNum1 << "/" << iDen1 << " + ";
    cout << iNum2 << "/" << iDen2 << " = ";
        cout << iCNSum << "/" << iCD << endl;
        
    cout << iNum1 << "/" << iDen1 << " - ";
    cout << iNum2 << "/" << iDen2 << " = ";
        cout << iCNRes << "/" << iCD << endl;
        
    cout << iNum1 << "/" << iDen1 << " * ";
    cout << iNum2 << "/" << iDen2 << " = ";
        cout << iCNPro << "/" << iCD << endl;
        
    cout << iNum1 << "/" << iDen1 << " / ";
    cout << iNum2 << "/" << iDen2 << " = ";
        cout << iCNDiv << "/" << iCDDiv << endl;
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
