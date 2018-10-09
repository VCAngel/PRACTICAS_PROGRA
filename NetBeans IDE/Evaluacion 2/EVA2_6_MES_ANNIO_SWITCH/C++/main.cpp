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
    cout << "Introduce un número entre 1 y 12" << endl;
    int iMes;
    
    cin >> iMes;
    switch (iMes) {
        case 1: 
            cout << "Enero" << endl;
            break;
        case 2:
            cout << "Febrero"<< endl;
            break;
        case 3: 
            cout << "Marzo" << endl;
            break;
        case 4:
            cout << "Abril" << endl;
            break;
        case 5:
            cout << "Mayo" << endl;
            break;
        case 6:
            cout << "Junio" << endl;
            break;
        case 7:
            cout << "Julio" << endl;
            break;
        case 8: 
            cout << "Agosto" << endl;
            break;
        case 9:
            cout << "Septiembre" << endl;
            break;
        case 10:
            cout << "Octubre" << endl;
            break;
        case 11:
            cout << "Noviembre" << endl;
            break;
        case 12:
            cout << "Diciembre" << endl;
            break;
        default:
            cout << "Introduce un numero valido" << endl;
            break;
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
