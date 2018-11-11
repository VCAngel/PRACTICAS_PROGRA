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
    bool bMaterias, bServicio, bResidencias;
    
	cout << "Acreditaste tus materias? " << endl;
    cin >> bMaterias;
	cout << "Hiciste tu servicio? " << endl; 
    cin >> bServicio;
	cout << "Terminaste tus residencias? " << endl;
    cin >> bResidencias;

    if ((bMaterias && bServicio && bResidencias) == true) {
        cout << "TE PUEDES TITULAR" << endl;
    } else {
        cout << "NO TE PUEDES TITULAR" << endl;
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
