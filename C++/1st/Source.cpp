//Assignment 1: Christopher Guzowski & Phuong Ho
#include<iostream>
using namespace std;
#include<fstream>
#include<string>

const int BK_MK_LEN = 50;
const int CAT_LEN = 30;
const int NUM_URLS = 50;

int read_bookmarks(char[][BK_MK_LEN], char[][CAT_LEN]);
void sort_bookmarks(int, char[][BK_MK_LEN], char [][CAT_LEN]);
int menu();
void display_bookmark(int, char [][BK_MK_LEN], char [][CAT_LEN]);
int add_bookmark(int, char [][BK_MK_LEN], char [][CAT_LEN], int);
void quit(int,  char [][BK_MK_LEN], char [][CAT_LEN], int);
int search(int, char[][BK_MK_LEN], int);
int delete_bookmark(int, char[][BK_MK_LEN], char[][CAT_LEN], int, int);

void main()
{
	int count, choice, lookup;

	char bookmark[NUM_URLS][CAT_LEN];
	char URL[NUM_URLS][BK_MK_LEN];

	choice = menu();	
	count = read_bookmarks(URL, bookmark);
	sort_bookmarks(count, URL, bookmark);
	display_bookmark(count, URL, bookmark);
	quit(count, URL, bookmark, choice);

    add_bookmark(count, URL, bookmark, choice); 
	lookup = search(count, URL, choice); 
	delete_bookmark(count, URL, bookmark, choice, lookup); 
		
	system("pause");
}

int menu()
{		
		int choice; 

		cout<<"1) To delete a bookmark\n2) To add a bookmark\n3) To quit";
		cin>>choice;
		
		cout<<endl;

		if(choice == 1 || choice == 2 || choice == 3)
		{
			cout<<"You entered a valid choice."<<endl<<endl;

		}
		else
		{	while(choice != 1 && choice != 2 && choice !=3)
			{
				cout<<"You entered an invalid number. Please enter 1 to delete a bookmark, 2 to add a bookmark or 3 to quit."<<endl;
				cin>>choice;
			}
			cout<<"You entered a valid choice."<<endl<<endl;	
		}
		return choice;
}

int read_bookmarks(char URL[][BK_MK_LEN], char bookmark[][CAT_LEN])
{  
	int count = 0;

	ifstream fin;
	fin.open("E:\\bookmark.dat");

	if (!fin)
	{
		cout << "Wrong pathway, file cannot be found." << endl;
		exit(1);
	}
	else
	{
		fin >> bookmark[count];
		fin >> URL[count];
		
		while(!fin.EOF())
		{
			count++;
			fin >> bookmark[count];
			fin >> URL[count];
		}
	cout<<"The number of URLs read is "<<count<<endl;
	}
	fin.close();
	return count;
}

void sort_bookmarks(int count, char URL[][BK_MK_LEN], char bookmark[][CAT_LEN])
{ 
	char temp1[CAT_LEN];
	char temp2[BK_MK_LEN];

	for (int j = 0; j < count-1 ; j++)
	{
		for (int k = count-1; j<k; k--)
		{
			if (strcmp(bookmark[k-1], bookmark[k])>0)
			{
				strcpy(temp1, bookmark[k-1]);
				strcpy(bookmark[k-1], bookmark[k]);
				strcpy(bookmark[k], temp1);
           
				strcpy(temp2, URL[k-1]);
				strcpy(URL[k-1], URL[k]);
				strcpy(URL[k], temp2);
			}
		}
	}

}

void display_bookmark(int count, char URL[][BK_MK_LEN], char bookmark[][CAT_LEN])
{
	
	cout<<"Your list of bookmarks:\n"<<endl;

	for(int j=0; j<count; j++)
	cout<<bookmark[j]<<" "<<URL[j]<<endl;

	cout<<endl;
}

int add_bookmark(int choice, char URL[][BK_MK_LEN], char bookmark[][CAT_LEN])
{ 	
	int i = 0;
	char newURL[40][BK_MK_LEN];
	char newBookmark[40][BK_MK_LEN];

	bool answer = 1;
			
	if(choice == 2)
	{
		cin.ignore();
		cout<<"You chose to add a bookmark. Please enter the category of the URL."<<endl;
		cin.getline(newBookmark[i],BK_MK_LEN);
		cin.clear();

		cout<<"Please enter the URL: "<<endl;
		cin.getline(newURL[i],BK_MK_LEN);
		cin.clear();
					
		ofstream out;
		out.open("bookmark.txt");

		if(out.is_open())
		{								
			cout<<"\n\nThe following will be added to the data file: "<<newBookmark[i]<<" "<<newURL[i]<<endl<<endl;
			cout<<newBookmark[i]<<" "<<newURL[i]<<endl;
		}
		else 
		{ 
			cout<<"Unable to open file"<<endl;
		}

	out.close();	
	sort_bookmarks(count, URL, bookmark);
	i++;

	cout<<"Would you like to add another bookmark? Please answer 1 for yes or 0 for no: "<<endl;
	cin>>answer;
	}
			
	while((answer == 1) && i<40)
	{							
		if(choice==2)
		{	
			cin.ignore();
			cout<<"You chose to add a bookmark. Please enter the category of the URL."<<endl;
			cin.getline(newBookmark[i],BK_MK_LEN);
			cin.clear();
							
			cout<<"Please enter the URL: "<<endl;
			cin.getline(newURL[i],BK_MK_LEN);
			cin.clear();

			ofstream out;
			out.open("bookmark.txt");

			if(out.is_open())
			{				
			cout<<"\n\nThe following will be added to the data file: "<<newBookmark[i]<<" "<<newURL[i]<<endl<<endl;
			out<<newBookmark[i]<<" "<<newURL[i]<<endl;
			}

			else 
			{ 
				cout<<"Unable to open file"<<endl;
			}
			out.close();
			sort_bookmarks(count, URL, bookmark);
			i++;
			count++;				
			cout<<"Would you like to add another bookmark? Please answer 1 for yes or 0 for no: "<<endl;
			cin>>answer;				
			}
	}
	if(answer==0)
	{
		cout<<"\n\nYou chose to not add any more bookmarks. Thank you for using this bookmark program."<<endl;
	}	
return count;
}

int search(int count, char URL[][BK_MK_LEN], char bookmark[][CAT_LEN])
{	
	char searchURL[NUM_URLS][BK_MK_LEN];
	int i = 0;
	
	for(int k = 0; k < count; k++) 
	{ 
		if(searchURL[i] ==  URL[k])
		{
			return k;
		}				
		else
		{
			return -1;
		}	
}

int delete_bookmark(int count,char URL[][BK_MK_LEN],char bookmark[][CAT_LEN], int choice, int lookup)
{	
	int i = 0;
	char searchURL[NUM_URLS][BK_MK_LEN];
	int answer = 1;
		
	if(choice == 1)
	{
		cin.ignore();
		cout<<"You chose to delete a bookmark. Please enter the URL you would like to delete: "<<endl;
		cin.getline(searchURL[i],BK_MK_LEN);
		cin.clear();
	}
	if(lookup != -1)
	{
		delete [lookup]URL;
		delete [lookup]bookmark;
		sort_bookmarks(count, URL, bookmark);
		count--;
		i++;
	}		
	else
	{
		cout<<"The URL was not found. Please try again."<<endl;
	}
	cout<<"Would you like to delete another bookmark? Please answer 1 for yes or 0 for no: "<<endl;
	cin>>answer;

	while((answer == 1))
	{
		if(choice == 1)
		{
			cin.ignore();
			cout<<"You chose to delete a bookmark. Please enter the URL you would like to delete: "<<endl;
			cin.getline(searchURL[i],BK_MK_LEN);
			cin.clear();
		}
		if(lookup != -1)
		{
			delete [lookup]URL;
			delete [lookup]bookmark;
			count--;
			i++;
		}
		else
		{
			cout<<"The URL was not found. Please try again."<<endl;
		}
		sort_bookmarks(count, URL, bookmark);
		cout<<"Would you like to delete another bookmark? Please answer 1 for yes or 0 for no: "<<endl;
		cin>>answer;	
	}	
return count;			
}

void quit(int choice,  char URL[][BK_MK_LEN], char bookmark[][CAT_LEN],)
{		
	if(choice==3)
	{
		cout<<"You chose to quit. No more bookmarks will be added or deleted"<<endl;
	}
}