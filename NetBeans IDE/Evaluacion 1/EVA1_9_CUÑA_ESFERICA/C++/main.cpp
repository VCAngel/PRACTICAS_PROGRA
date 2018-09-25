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
    cout << "Calcular el valor de una Cuña Esférica. Introduce los datos." << endl;
    double rVol, rRad, rGrad;
    
    cout << "Radio:" << endl;
    cin >> rRad;
    cout << "Grados de apertura:" << endl;
    cin >> rGrad;
    rVol = (double) 4 / 3 * (3.14159 * pow(rRad, 3) / 360) * rGrad;
    cout << "Volumen = ";
    cout << rVol << endl;
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
