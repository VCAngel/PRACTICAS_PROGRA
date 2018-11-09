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
    
    int iRand, iNum;
    
    iRand = rand() % 11;
    iNum = 0;
    while (iRand != iNum) {
        cout << "Adivina el numero: " << endl;
        cin >> iNum;
    }
    cout << "ADIVINASTE!!!" << endl;
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
