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
    cout << "Introduce tu nombre:" << endl;
    string sNombre;
    
    cin >> sNombre;
    cout << "Introduce tu edad:" << endl;
    int iEdad;
    
    cin >> iEdad;
    int iAnnio;
    
    iAnnio = 2018 - iEdad;
    cout << "Tu nombre es ";
    cout << sNombre << endl;
    cout << "Naciste en el ";
    cout << iAnnio << endl;
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
