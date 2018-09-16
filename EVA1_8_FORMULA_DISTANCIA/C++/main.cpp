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
    cout << "Calcular distancia. Introduce los datos." << endl;
    cout << "Velocidad Inicial:" << endl;
    double rVelI;
    
    cin >> rVelI;
    cout << "Velocidad final:" << endl;
    double rVelF;
    
    cin >> rVelF;
    cout << "Tiempo:" << endl;
    double rTiem;
    
    cin >> rTiem;
    double rDist;
    
    rDist = (rVelF + rVelI) / 2 * rTiem;
    cout << "Distancia = ";
    cout << rDist << endl;
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
