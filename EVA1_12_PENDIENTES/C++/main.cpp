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
    cout << "Calcular fórmula de la pendiente. Introduce los datos." << endl;
    double rx1, rx2, ry1, ry2, rM;
    
    cout << "x1 = ?" << endl;
    cin >> rx1;
    cout << "x2 = ?" << endl;
    cin >> rx2;
    cout << "y1 = ?" << endl;
    cin >> ry1;
    cout << "y2 = ?" << endl;
    cin >> ry2;
    rM = (ry2 - ry1) / (rx2 - rx1);
    cout << "M = ";
    cout << rM << endl;
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
