import java.util.Scanner;
class Searchele
{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    		int i,b,search,flag=0;
			int arr[]={70,20,100,80,50,60};
			b=arr.length;
		System.out.println("Enter the element to be searched");
		search = sc.nextInt();//user input to search number
    		for(i=0;i<b;i++)
    		{
        		if(arr[i]==search)
        		{
            			System.out.println("Element found "+search);
            			flag=1;
            			break;
        		}
    		}
    		if(flag==0)
    		{
        		System.out.println("Element "+search+" not found");
    		}
	}
}