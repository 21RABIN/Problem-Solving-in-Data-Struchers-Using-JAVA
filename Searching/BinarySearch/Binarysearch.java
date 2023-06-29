/**
 * 
 */
package BinarySearch;

/**
 * @author Rabin
 *
 */
import java.util.Scanner;
class BinarySearching
{
	//Declare a Integer Variable
	int mid,n,i,j,k;
	//Declare boolean Variable
	boolean flag;
	int a[]=new int[10];
	//Creating an object sc for Scanner Class 
	Scanner sc=new Scanner(System.in);
	//creting Method
	public void search()
	{
		System.out.println("Enter the Number of Elements :");
		n=sc.nextInt();
        System.out.println("Enter the Element Should be Sorded Order :");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Enter the Search Element : ");
		k=sc.nextInt();
		int low=0,high=a.length-1;
/*		
 *index   : 0   1  2  3  4
 *          ^   ^  ^  ^  ^
 *          |   |  |  |  |
 *Elements: 10 20 30 40 50 search=40
 *
 * mid=(low+high)/2  low = 0index,high= 4index;
 * mid=(0+4)/2 ;
 * mid=2
 * Then Compare mid element and Search Element  mid=2,search=40;
 * mid<search   low=mid+1  low=2+1  low=3 
 * mid>search   high=mid-1 high=2-1 high=1  
 * mid=search   return(mid value)
 * 
 * reppet this process
 * Loop running is  Array.length=5 
 * 
 * follow contition not satisfied print Element not founded
	*/	
		while(low<=high)    
		{
			
			mid=(low+high)/2;  
	
			if(a[mid]<k)
			{
				low=mid+1;
				
			}
			else if(a[mid]>k)
			{
				high=mid-1;
				
			}
			else
			{
			System.out.println("Element Founded at Position :"+mid);
			  flag=true;	
			  break;
		     }
	       
		}
		if(flag==false)
		{
			System.out.println("Element Not Founded"+i);
		}
		
	}
	
}

//Main Class 
public class Binarysearch {
	//Main Function
	public static void main(String[] args) {
		
		//Creating an object b for class binarySearching
		BinarySearching b=new BinarySearching();
		//Call the method
		b.search();
	}

}

/*------------OUTPUT---------------
Enter the Number of Elements :
5
Enter the Element Should be Sorded Order :
10 20 30 40 50
Enter the Search Element : 
40
Element Founded at Position :3
*/