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
    int iNum1, iNum2;
    
    cout << "Introduce el primer n�mero: " << endl;
    cin >> iNum1;
    cout << "Introduce el segundo n�mero: " << endl;
    cin >> iNum2;
    if (iNum1 == iNum2) {
        cout << "Son n�meros iguales" << endl;
    } else {
        cout << "No son n�meros iguales" << endl;
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
