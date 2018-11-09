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
    int iSum, i;
    
    iSum = 0;
    for (i = 1; i <= 100; i++) {
        iSum = iSum + i;
        cout << i << endl;
    }
    cout << "Sumatoria de todos los numeros: ";
    cout << iSum << endl;
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
