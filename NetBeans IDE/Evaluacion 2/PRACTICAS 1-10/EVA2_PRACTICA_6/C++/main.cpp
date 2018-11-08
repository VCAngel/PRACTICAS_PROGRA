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
    int iX, iY;
    
    cout << "Coordenada en X = " << endl;
    cin >> iX;
    cout << "Coordenada en Y = " << endl;
    cin >> iY;
    if (iX > 0 && iY > 0) {
        cout << "Coordenadas del Cuadrante 1" << endl;
    } else {
        if (iX < 0 && iY > 0) {
            cout << "Coordenadas del Cuadrante 2" << endl;
        } else {
            if (iX < 0 && iY < 0) {
                cout << "Coordenadas del Cuadrante 3" << endl;
            } else {
                if (iX > 0 && iY < 0) {
                    cout << "Coordenadas del Cuadrante 4" << endl;
                }
            }
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
