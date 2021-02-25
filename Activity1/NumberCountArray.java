import java.util.Scanner;

public class NumberCountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int arr []= new int [size];
		
		System.out.println("Enter the elements into the array of size"+size);
		
		for(int i =0;i<size;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Entered elements are");
		for(int i =0;i<size;i++) {
			System.out.println(arr[i]);
				
		}
		System.out.println("Enter the element to know the no of times it is present in the array");
		int ele = sc.nextInt();
		
		
		searchArrray(arr,ele);
		
		
	}
	
	static void searchArrray(int ar[],int e) {
		
		int count=0;
	
		for(int i =0;i<ar.length;i++) {
			
			if(ar[i]==e)count++;
		}
		
		System.out.println("element  "+e +" has repeted "+count +" times ");
		
	}


	}


