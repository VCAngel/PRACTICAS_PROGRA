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
    int iNum, i;
    
    cout << "Introduce un numero entero: ";
    cin >> iNum;
    for (i = 1; i <= 100; i++) {
        int iMod;
        
        iMod = i % iNum;
        if (iMod != 0) {
            cout << i << endl;
        }
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
