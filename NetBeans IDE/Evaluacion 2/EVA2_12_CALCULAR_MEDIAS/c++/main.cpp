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
    int iSumaEdad, iSum;
    
    iSumaEdad = 0;
    cout << "Edad 1: " << endl;
    cin >> iSum;
    iSumaEdad = iSumaEdad + iSum;
    cout << "Edad 2: " << endl;
    cin >> iSum;
    iSumaEdad = iSumaEdad + iSum;
    cout << "Edad 3: " << endl;
    cin >> iSum;
    iSumaEdad = iSumaEdad + iSum;
    cout << "Edad 4: " << endl;
    cin >> iSum;
    iSumaEdad = iSumaEdad + iSum;
    cout << "Edad 5: " << endl;
    cin >> iSum;
    iSumaEdad = iSumaEdad + iSum;
    double dMedia;
    
    dMedia = (double) iSumaEdad / 5;
    cout << "La suma es = ";
    cout << iSumaEdad << endl;
    cout << "La media es = ";
    cout << dMedia << endl;
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
