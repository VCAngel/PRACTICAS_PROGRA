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
    int iSuma, i, iSumInput;
    
    iSuma = 0;
    for (i = 1; i <= 5; i++) {
        cout << "Edad ";
        cout << i;
        cout << ": " << endl;
        cin >> iSumInput;
        iSuma = iSuma + iSumInput;
    }
    double dMedia;
    
    dMedia = (double) iSuma / 5;
    cout << "La media es: ";
    cout << dMedia << endl;
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
