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
    cout << "Introduce un número de la semana" << endl;
    int iDia;
    
    cin >> iDia;
    switch (iDia) {
        case 1: 
            cout << "Domingo" << endl;
            break;
        case 2:
            cout << "Lunes"<< endl;
            break;
        case 3: 
            cout << "Martes" << endl;
            break;
        case 4:
            cout << "Miercoles" << endl;
            break;
        case 5:
            cout << "Jueves" << endl;
            break;
        case 6:
            cout << "Viernes" << endl;
            break;
        case 7:
            cout << "Sábado" << endl;
            break;
        default:
            cout << "Día de la semana inexistente" << endl;
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
