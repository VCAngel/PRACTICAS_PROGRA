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
    int iTemp;
    
    cout << "Temperatura (ºC): " << endl;
    cin >> iTemp;
    if (iTemp < 0) {
        cout << "Freezing Cold Weather" << endl;
    } else {
        if (iTemp >= 0 && iTemp < 10) {
            cout << "Very Cold Weather" << endl;
        } else {
            if (iTemp >= 10 && iTemp < 20) {
                cout << "Cold Weather" << endl;
            } else {
                if (iTemp >= 20 && iTemp < 30) {
                    cout << "Normal in Temperature" << endl;
                } else {
                    if (iTemp >= 30 && iTemp < 40) {
                        cout << "It's Hot" << endl;
                    } else {
                        if (iTemp >= 40) {
                            cout << "It's Very Hot!" << endl;
                        }
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
