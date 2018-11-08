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
    int iNum, iMod;
    
    cout << "Introduce un n�mero: " << endl;
    cin >> iNum;
    iMod = iNum % 2;
    if (iMod == 0) {
        cout << "N�mero par" << endl;
    } else {
        cout << "N�mero Impar" << endl;
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
