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
    cout << "Área de un trapecio. Introduzca los datos." << endl;
    double rBaMa, rBaMe, rAlt, rArea;
    
    cout << "Base mayor:" << endl;
    cin >> rBaMa;
    cout << "Base Menor:" << endl;
    cin >> rBaMe;
    cout << "Altura:" << endl;
    cin >> rAlt;
    rArea = (rBaMa + rBaMe) / 2 * rAlt;
    cout << "Area = ";
    cout << rArea << endl;
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
