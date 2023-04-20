package one_to_many;

import java.util.Scanner;

public class HP_controller 
{
	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in);
		    HP_dao hp =new HP_dao();
		    for(;;) 
		    {
		    	 System.out.println("1. Insert data  2.update data  3.remove data 4. display data 5.exit");
		  	   switch(sc.nextInt())
		  	      {
		  	         case 1:
		  	          {
		  	        	hp.insertvalue();
		  	          }
		  	           break;
		  	         case 2:
		  	          {
		  	        	hp.updateData();
		  	            break;
		  	          }
		  	          case 3:
		  	          {
		  	        	hp.deletetData();
		  	          }
		  	           break;
		  	          
		  	         case 4:
		  	          {
		  	        	hp.getData();
		  	          }
		  	           break;
		  	         case 5:
		 	          {
		 	           System.exit(0);
		 	          }
		 	           break;
		  	       }
		    }
	}
	
}
