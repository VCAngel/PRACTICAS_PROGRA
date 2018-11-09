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
    for(int i = 1; i < 10; i++){
	cout << i << endl;
	int iResi = i % 5;
	if(iResi == 0)
		break;
}

for(int i = 1; i < 10; i++){
	int iResi = i % 5;
	if(iResi == 0)
		continue;
	cout << i << endl;
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