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
    cout << "Introduce un n�mero entre 1 y 12" << endl;
    int iMes;
    
    cin >> iMes;
    if (iMes == 1) {
        cout << "Enero" << endl;
    } else {
        if (iMes == 2) {
            cout << "Febrero" << endl;
        } else {
            if (iMes == 3) {
                cout << "Marzo" << endl;
            } else {
                if (iMes == 4) {
                    cout << "Abril" << endl;
                } else {
                    if (iMes == 5) {
                        cout << "Mayo" << endl;
                    } else {
                        if (iMes == 6) {
                            cout << "Junio" << endl;
                        } else {
                            if (iMes == 7) {
                                cout << "Julio" << endl;
                            } else {
                                if (iMes == 8) {
                                    cout << "Agosto" << endl;
                                } else {
                                    if (iMes == 9) {
                                        cout << "Septiembre" << endl;
                                    } else {
                                        if (iMes == 10) {
                                            cout << "Octubre" << endl;
                                        } else {
                                            if (iMes == 11) {
                                                cout << "Noviembre" << endl;
                                            } else {
                                                if (iMes == 12) {
                                                    cout << "Diciembre" << endl;
                                                } else {
                                                    cout << "Introduce un n�mero v�lido" << endl;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
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
