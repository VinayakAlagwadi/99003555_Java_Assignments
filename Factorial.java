import java.util.Scanner;

public class Factorial {
	
	int arr [] = new int [5];
	int tent,thou,hun,ten,uni;
	
	void digitFactorial(int n){
		
	//	int arr [] = new int [5];
		
		 tent = n/10000;
		
		 thou = (n-tent)/1000;
		
		 hun = (n-tent-thou)/100;
		
		 ten = (n-tent-thou-hun)/10;
		
		 uni = (n-tent-thou-hun-ten);
		
	}
	
	

	public void tentfact(){
			
			int i;
			int fact = 1;
			for(i=1;i<=tent;i++){    
		      fact=fact*i;
		      arr[0]=fact;
		  }
		  
		  
		  
		  }  
	
	void thoufact(){
		
		int i;
		int fact =1;
		  for(i=1;i<=thou;i++){    
		      fact=fact*i;
		      arr[1]=fact;
		  }
		  
		  
		  
		  }  
	
	void hunfact(){
		
		int i;
		int fact =1;
		  for(i=1;i<=hun;i++){    
		      fact=fact*i;
		      arr[2]=fact;
		  }
		  
		  
		  
		  }  
	
	
	void tenfact(){
		
		int i;
		int fact =1;
		  for(i=1;i<=ten;i++){    
		      fact=fact*i;
		      arr[3]=fact;
		  }
		  
		  
		  
		  }  
	void unifact(){
		
		int i;
		int fact =1;
		  for(i=1;i<=tent;i++){    
		      fact=fact*i;
		      arr[4]=fact;
		  }
		  
		  
		  
		  }  
	
	
	void display(){
		
		for(int i=0; i<5;i++){
			
			System.out.println(arr[i]);
			
		}
		
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter any number less than 32767");
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         
	}

}
