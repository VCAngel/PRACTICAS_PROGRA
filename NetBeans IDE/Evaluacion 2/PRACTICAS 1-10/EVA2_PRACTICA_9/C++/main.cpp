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
    int iA, iB, iC;
    
    cout << "Ax^2 + Bx + C = 0" << endl;
    cout << "A = ";
    cin >> iA;
    cout << "B = ";
    cin >> iB;
    cout << "C = ";
    cin >> iC;
    cout << iA;
    cout << "x^2 + ";
    cout << iB;
    cout << "x + ";
    cout << iC;
    cout << " = 0" << endl;
    double dRaiz, dDisc, dX1, dX2;
    
    dRaiz = pow(iB, 2) - 4 * iA * iC;
    dDisc = sqrt(dRaiz);
    dX1 = (-iB + dDisc) / (2 * iA);
    dX2 = (-iB - dDisc) / (2 * iA);
    if (dRaiz == 0) {
        cout << "Es un Trinomio Cuadrado Perfecto" << endl;
        cout << "Sus raices son: ";
        cout << "x1 = ";
        cout << dX1;
        cout << ", x2 = ";
        cout << dX2 << endl;
    } else {
        if (dRaiz > 0) {
            cout << "Es otro tipo de Trinomio" << endl;
        } else {
            cout << "No se puede resolver" << endl;
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
