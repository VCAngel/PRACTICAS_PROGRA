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
    cout << "Introduce tu calificacion:" << endl;
    int iCali;
    
    cin >> iCali;
    if (iCali == 100) {
        cout << "A" << endl;
    } else {
        if (iCali >= 90 && iCali < 100) {
            cout << "B" << endl;
        } else {
            if (iCali >= 80 && iCali < 90) {
                cout << "C" << endl;
            } else {
                if (iCali >= 70 && iCali < 80) {
                    cout << "D" << endl;
                } else {
                    if (iCali >= 0 && iCali < 70) {
                        cout << "F" << endl;
                    } else {
                        cout << "Fuera de rango" << endl;
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
