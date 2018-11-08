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
    int iAng1, iAng2, iAng3;
    
    cout << "Valor de Angulo 1 = ";
    cin >> iAng1;
    cout << "Valor de Angulo 2 = ";
    cin >> iAng2;
    cout << "Valor de Angulo 3 = ";
    cin >> iAng3;
    if (iAng1 == iAng2 && iAng2 == iAng3) {
        cout << "Triangulo Equilatero" << endl;
    } else {
        if (iAng1 == iAng2 || iAng1 == iAng3 || iAng2 == iAng3) {
            cout << "Triangulo Isoceles" << endl;
        } else {
            cout << "Triangulo Escaleno" << endl;
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
