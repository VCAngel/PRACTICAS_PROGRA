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
    cout << "INTRODUCE EL A�O" << endl;
    int iAnnio;
    
    cin >> iAnnio;
    if (iAnnio % 4 == 0) {
        if (iAnnio % 100 == 0) {
            if (iAnnio % 400 == 0) {
                cout << "ES BISIESTO" << endl;
            } else {
                cout << "NO ES BISIESTO" << endl;
            }
        } else {
            cout << "ES BISIESTO" << endl;
        }
    } else {
        cout << "NO ES BISIESTO" << endl;
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
