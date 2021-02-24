import java.util.*;

class CheckLeapYear{

    static int checkLeapOrNot(int year){
        if (year % 100 ==0 && year % 400 ==0 ){
            // System.out.println(year+"is a leap year"); 
            return 1;

            }
            else if(year < 0) 
            {   return -1;


            }
            else {
                // System.out.println(year+"is not a leap year");
                return 0;

        }
    }

        public static void main(String[] args)
        {

            System.out.println("Enter the year to check whether leap or not");
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            if (checkLeapOrNot(n)==1){
            	System.out.println("yes");
            }
            	
            	else if(checkLeapOrNot(n)==-1){
            		System.out.println("invalid input");
            	}
            	else if (checkLeapOrNot(n)==0){
            		System.out.println("no");
            		
            	}
            }
            
        


    }
