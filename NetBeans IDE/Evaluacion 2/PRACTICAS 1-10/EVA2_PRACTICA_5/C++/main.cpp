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
    int iNum1, iNum2, iNum3;
    
    cout << "Introduce el primer valor: " << endl;
    cin >> iNum1;
    cout << "Introduce el segundo valor: " << endl;
    cin >> iNum2;
    cout << "Introduce el tercer valor: " << endl;
    cin >> iNum3;
    cout << "El número mayor es = ";
    if (iNum1 >= iNum2 && iNum1 >= iNum3) {
        cout << iNum1 << endl;
    } else {
        if (iNum2 >= iNum1 && iNum2 >= iNum3) {
            cout << iNum2 << endl;
        } else {
            if (iNum3 >= iNum1 && iNum3 >= iNum2) {
                cout << iNum3 << endl;
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
