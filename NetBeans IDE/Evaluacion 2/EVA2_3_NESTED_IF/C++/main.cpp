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
    cout << "INTRODUCE TU CALIFICACIÓN" << endl;
    int iCali;
    
    cin >> iCali;
    if (iCali == 100) {
        cout << "Sacaste A" << endl;
    } else {
        if (iCali == 90) {
            cout << "Sacaste B" << endl;
        } else {
            if (iCali == 80) {
                cout << "Sacaste C" << endl;
            } else {
                if (iCali == 70) {
                    cout << "Sacaste D" << endl;
                } else {
                    if (iCali == 60) {
                        cout << "Sacaste F" << endl;
                    } else {
                        cout << "Calificiación fuera de rango" << endl;
                    }
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
