import java.util.Scanner;
class Miniele{
	public static void main(String args[]){
		int a,b;
		int arr[]={70,80,30,40,50,60};
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
	System.out.println("the minimum element is"+arr[0]);
	}
}	
		