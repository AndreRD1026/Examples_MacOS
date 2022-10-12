#include <iostream>
#include<fstream>

using namespace std;

void read();
void readfilepath();
std:: string alltext;

int main(int argc, char** argv) {

	int opt = 0; 
	do{
	cout<<"--------Menu--------"<<endl;
	cout<<"1. Read Local File"<<endl;
	cout<<"2. Read File with Path"<<endl;
	cout<<"3. See Content"<<endl;
	cout<<"4. Exit"<<endl;
	cout<<"Select one option: ";
	cin>>opt;

		switch (opt){
	case 1:
		//Call the function
		read();
		break;

	case 2:
		//Call the function
		readfilepath();
		break;

	case 3:
		//Call the var that contain all the text
		if (alltext == ""){
			cout<<"Need read a file before"<<endl;
		}
		else{
		cout<<alltext<<endl;
		}
		break;

	case 4:
		cout<<"\nFinish program\n"<<endl;
		break;
	
	default:
		cout<<"\nNeed to choice one option of the menu\n"<<endl;
		break;
	}
	}while(opt!=4);
	
}

//==========================Using functions==========================

//Function that get the content of local file
void read(){
		ifstream file;
		string text;
		file.open("text.txt", ios::in);
		if(file.fail()){
		cout<<"\nCan't open the file\n"<<endl;
		}

		while (!file.eof())
	{ 
		getline(file,text);
		alltext = text;
		cout<<"Successful upload"<<endl;
	}
	file.close();
}



// Function that get the path and open the file
void readfilepath(){
		ifstream file;
		string path;
		string text;
		cout<<"Put the path of file "<<endl;
		cin.ignore();
		getline(cin,path);
		file.open(path.c_str(), ios::in);
		if(file.fail()){
		cout<<"\nCan't open the file\n"<<endl;
		}

		while (!file.eof())
	{ 
		getline(file,text);
		alltext = text;
		cout<<"Successful upload"<<endl;
	}
	file.close();


}