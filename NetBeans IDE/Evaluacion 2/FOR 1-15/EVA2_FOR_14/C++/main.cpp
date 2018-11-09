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
    int i, j;
    
    for (i = 1; i <= 10; i++) {
        for (j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << "" << endl;
    }
    for (i = 9; i >= 1; i--) {
        for (j = i; j >= 1; j--) {
            cout << "*";
        }
        cout << "" << endl;
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
