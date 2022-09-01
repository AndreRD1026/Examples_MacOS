#include <iostream>

using namespace std;

int main(int argc, char** argv) {

	int opt = 0; 
	do{ // repeat the menu
	cout<<"--------Menu--------"<<endl;
	cout<<"1. First opc"<<endl;
	cout<<"2. Second opc"<<endl;
	cout<<"3. Third opc"<<endl;
	cout<<"4. Exit"<<endl;
	cout<<"Select one option: ";
	cin>>opt; //get input number

		switch (opt){
	case 1:
		cout<<"\nEnter to option 1\n"<<endl;
		break;

	case 2:
		cout<<"\nEnter to option 2\n"<<endl;
		break;

	case 3:
		cout<<"\nEnter to option 3\n"<<endl;
		break;

	case 4:
		cout<<"\nFinish program\n"<<endl;
		break;
	
	default:
		cout<<"\nNeed to choice one option of the menu\n"<<endl; //When you put another number differents 1 to 4
		break;
	}
	}while(opt!=4); //Finish the loop when you put number 4
	
}
