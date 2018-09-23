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
    cout << "Qu� calificaci�n obtuviste en Fundamentos de programaci�n:" << endl;
    double rCal;
    
    cin >> rCal;
    cout << "Tu calificaci�n es: ";
    cout << rCal << endl;
    if (rCal >= 70) {
        cout << "�Aprobaste!" << endl;
    } else {
        cout << "Nos vemos en segunda oportunidad" << endl;
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
