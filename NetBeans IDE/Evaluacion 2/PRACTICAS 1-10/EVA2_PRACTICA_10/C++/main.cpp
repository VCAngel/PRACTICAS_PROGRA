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
    int iMat, iFis, iQui;
    
    cout << "Calificacion en Matematicas: " << endl;
    cin >> iMat;
    cout << "Calificacion en Fisica: " << endl;
    cin >> iFis;
    cout << "Calificacion en Quimica: " << endl;
    cin >> iQui;
    int iSumTres;
    
    iSumTres = iMat + iFis + iQui;
    if (iMat >= 65 && iFis >= 55 && iQui >= 50 && iSumTres >= 180 || iMat >= 65 && iSumTres >= 140) {
        cout << "El candidato es elegible para el curso" << endl;
    } else {
        cout << "El candidato no es elegible para el curso" << endl;
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
