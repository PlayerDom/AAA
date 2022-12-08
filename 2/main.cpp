#include<iostream>
using namespace std;

int main()
{
    string str;
    std::cout << "Inserisci una stringa ";
    std::getline(std::cin,str);
    int i {0};


    for(char c: str){
    	if(str[i]>97 && str[i]<123 && i==0){
    		str[i]=std::toupper(str[i]);
    	}else if (c == ' ' && str[i+1]!=' '){
    		if(str[i+1]>97 && str[i+1]<123){
    			str[i+1]=std::toupper(str[i+1]);
    		}
    	}
    	i++;
    }

    std::cout << str;
    return EXIT_SUCCESS;
}

