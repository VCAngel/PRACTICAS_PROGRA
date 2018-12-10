#include <iostream>


using namespace std;


int Potencia (int &iVal, int &iVal2){

    int iRes = 1;

    for(int i = 1; i <= iVal2; i++){

        iRes *= iVal;

    }

    return iRes;

}



int main()

{

    int iVal, iVal2;

    cout << "Introduce un valor y su pontencia: " << endl;

    cin >> iVal;

    cin >> iVal2;

cout << "La pontencia es: ";

cout << Potencia(iVal, iVal2) << endl;

    return 0;

}