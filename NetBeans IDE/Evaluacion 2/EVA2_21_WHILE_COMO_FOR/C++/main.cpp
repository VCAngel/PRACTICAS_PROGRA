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
    int i, iWhile;
    
    for (i = 1; i <= 10; i++) {
        cout << i;
        cout << " - ";
    }
    cout << "" << endl;
    iWhile = 1;
    while (iWhile <= 10) {
        cout << iWhile;
        cout << " + ";
        iWhile = iWhile + 1;
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
