#include<iostream>


int main(){

	std::string stringa;
	  std::cout << "Inserisci una stringa ";
	  std::getline(std::cin,stringa);

	for(int i{0}; i<stringa.length(); i++){
		if (stringa[i]>97 && stringa[i]<123){
			stringa[i]= std::toupper(stringa[i]);

		} else if (stringa[i]>64 && stringa[i]<91){
			stringa[i]= std::tolower(stringa[i]);
		}
	}

	std::cout << stringa;
	return EXIT_SUCCESS;
}


