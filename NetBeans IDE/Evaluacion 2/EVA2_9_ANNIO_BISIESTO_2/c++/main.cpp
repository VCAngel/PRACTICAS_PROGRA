#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString(double);
int toInt(string);
double toDouble(string);

int main() {
	int iAnnio, iResi4, iResi100, iResi400;

	cout << "INGRESE UN ANNIO" << endl;
	cin << iAnnio;
	iResi4 = iAnnio % 4;
	iResi100 = iAnnio % 100;
	iResi400 = iAnnio % 400;
	if(iResi4 == 0 && iResi100 != 0 || iResi400 == 0){
	cout << "BISIESTO" << endl;
	} else {
	cout << "NO ES BISIESTO" << endl;
	}
	return 0;
}

// The following implements type conversion functions.
string toString(double value) { //int also
	stringstream temp;
	temp << value;
	return temp.str();
}