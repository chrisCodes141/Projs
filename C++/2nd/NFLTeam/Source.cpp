#include <iostream>
using namespace std;
#include <fstream>
#include <string>

struct player
{
	char name;
	char NFLTeam;;
};
struct league
{
	char position;
	char FLOwner;
};
struct Data
{
	player info;
	league info;
};

const int size = 20;

void main(){
	Data playerList[size];
	Data leagueList[size];
	ifstream fin;  
	fin.open("D:\\C++2\\Assignments\\2nd\\fantasy.dat");
	if(!fin)
	{
		cout << "Cannot open file" << endl;
		exit(1);
	}
	int k = 0;
	while(fin.getline(playerList,size))
	{
		fin.getline(playerList[k],"^");
		fin.getline(leagueList[k],"\n")<<endl;
		k++;
	}
	cout<<"Player\tTeam\tPosition\tOwner"
	cout<<"-------------------------------------------------------------------";
	for(int i=0; i<size; i++)
	{
		cout<<playerList[i]<<" "<<leagueList[i];
	}
}