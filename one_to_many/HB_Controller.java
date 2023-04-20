package one_to_many;

import java.util.Scanner;

public class HB_Controller
{
	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in);
		    HB_dao hb =new HB_dao();
		    for(;;) 
		    {
		    	 System.out.println("1. Insert data  2.update data  3.remove data 4. display data 5.exit");
		  	   switch(sc.nextInt())
		  	      {
		  	         case 1:
		  	          {
		  	        	hb.insertvalue();
		  	          }
		  	           break;
		  	         case 2:
		  	          {
		  	        	hb.updateData();
		  	            break;
		  	          }
		  	          case 3:
		  	          {
		  	        	hb.deleteData();
		  	          }
		  	           break;
		  	          
		  	         case 4:
		  	          {
		  	        	hb.getData();
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
