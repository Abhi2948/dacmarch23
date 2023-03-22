import java.util.Scanner;
class Maxele{
	public static void main(String args[]){
		int a,b;
		int arr[]={70,20,100,80,50,60};
		b=arr.length;
		for(int i=0;i<b;i++){
			for(int j=i+1;j<b;j++){
				if(arr[i]>arr[j]){
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
		}
	}
	System.out.println("the minimum element is"+arr[5]);
	}
}	
		