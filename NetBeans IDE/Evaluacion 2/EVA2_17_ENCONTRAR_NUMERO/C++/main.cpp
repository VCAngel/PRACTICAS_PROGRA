#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>
#include <ctime>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    srand(time(0));   //Seed random number generator"
    
    int iNumAlea, i;
    
    iNumAlea = rand() % 11;
    for (i = 0; i <= 2; i++) {
        cout << "Adivina el numero" << endl;
        int iNume;
        
        cin >> iNume;
        if (iNume == iNumAlea) {
            cout << "Felicidades, ganaste!!!" << endl;
	    break;
        }
        if (i == 2) {
            cout << "Perdiste" << endl;
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
