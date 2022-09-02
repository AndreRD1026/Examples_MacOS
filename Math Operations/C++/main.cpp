#include <iostream>

using namespace std;

int main(int argc, char** argv) {

	int opt = 0;
	float nmber1, nmber2;
	float add,less,product,divide; 
	do{
	cout<<"--------Menu--------"<<endl;
	cout<<"1. Addition"<<endl;
	cout<<"2. Subtraction"<<endl;
	cout<<"3. Multiplication"<<endl;
	cout<<"4. Division"<<endl;
	cout<<"5. Exit"<<endl;
	cout<<"Select one option: ";
	cin>>opt;
		switch (opt){
	case 1:
		cout<<"\nEnter the first number: ";
		cin>>nmber1;
		cout<<"\nEnter the second number: ";
		cin>>nmber2;
		add = nmber1 + nmber2; //Do the sum
		cout<<"\nThe result is : "<<add<<"\n"<<endl;
		break;

	case 2:
		cout<<"\nEnter the first number: ";
		cin>>nmber1;
		cout<<"\nEnter the second number: ";
		cin>>nmber2;
		less = nmber1 - nmber2; //Do the subtraction
		cout<<"\nThe result is : "<<less<<"\n"<<endl;
		break;

	case 3:
		cout<<"\nEnter the first number: ";
		cin>>nmber1;
		cout<<"\nEnter the second number: ";
		cin>>nmber2;
		product = nmber1 * nmber2; //Do the product
		cout<<"\nThe result is : "<<product<<"\n"<<endl;
		break;

	case 4:
		cout<<"\nEnter the first number: ";
		cin>>nmber1;
		cout<<"\nEnter the second number: ";
		cin>>nmber2;

		if(nmber2 == 0){ // Verify if number 2 is equal to 0
			cout<<"\nCan't divide by 0\n"<<endl;
		}else{
		divide = nmber1 / nmber2; //Do the division
		cout<<"\nThe result is : "<<divide<<"\n"<<endl;
		}
		break;

	case 5:
		cout<<"\nFinish program\n"<<endl;
		break;
	
	default:
		cout<<"\nNeed to choice one option of the menu\n"<<endl;
		break;
	}
	}while(opt!=5); 
	
}
