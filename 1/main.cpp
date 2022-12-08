#include<iostream>
#include<algorithm>


int main(){

	std::string frase{NULL};

	std::cout <<  "Inserisci la stringa:";
	std::cin >> frase;

	auto it1 = std::remove_if(frase.begin(), frase.end(), ::isspace);
	        frase.erase(it1, frase.end());
	auto it2 = std::remove_if(frase.begin(), frase.end(), ::ispunct);
	        frase.erase(it2, frase.end());

	std::string frase2 = frase;

	std::reverse(frase2.begin(), frase2.end());

	if(frase == frase2){
		std::cout << "la frase inserita è palindroma";
	}else{
		std::cout << "la frase inserita non è palindroma";
	}

	return EXIT_SUCCESS;
}


