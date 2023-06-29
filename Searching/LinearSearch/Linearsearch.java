package LinearSearch;

//import Scanner Class
import java.util.Scanner;

class LinearSearching
{
	//declare a integer variables
	int n,key;
	//declare a 1D Array
	int[] a=new int[100];
	boolean flag;
	//Creating an object sc for Scanner Class
	Scanner sc=new Scanner(System.in);
	//Creating a Method
	public void Search()
	{
		System.out.println("Enter the Number Of Elements: ");
		n=sc.nextInt();
		System.out.print("Enter the Elements :");
		
		//loop Array Element
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Element : ");
		 key=sc.nextInt();
		 
		 //Linar Searching
		for(int i=0;i<n;i++)
		{
			//Check the contition compare key element==Array element
			//Contition true is Element Fonded
			if(key==a[i])
			{
				System.out.println("Element fonded At Position:"+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Founded");
		}
	}
}
//Main Function
public class Linearsearch {

	public static void main(String[] args) {
		//Creating an object l for class LinearSearching
	LinearSearching l=new LinearSearching();
	//Call the method
		l.Search();
		
		
	}

}

/*
------------OUTPUT---------------
Enter the Number Of Elements: 
5
Enter the Elements :
20
30
50
10
80
Enter the Search Element : 
10
Element fonded At Position:3

*/