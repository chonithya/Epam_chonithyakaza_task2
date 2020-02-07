package epam;

import java.util.*;
public class Gift {
	    public static void main( String[] args )
	    { 
	        int num = 0,totalbox_wt = 10,total_candies = 0,total_weight = 0,wgt=0;
	        char n1;
	        Sweets choc;
	        Boolean n=true;
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("fill the gift box with different types of sweets available below");
	        while(n) {
	       
	        System.out.println("AVAILABLE SWEETS/CHOCLATES");
	        System.out.println("1.PERK");
	        System.out.println("2.SNICKERS");
	        System.out.println("3.KITKAT");       
	        System.out.println("4.DAIRY MILK");
	        System.out.println("5.MUNCH");
	        System.out.println("SELECT AN ITEM");
	        
	        try {
	        	
	        switch(sc.next().charAt(0))
	        {
	        case '1':
	        	   System.out.println("enter the number");
	        	   num=sc.nextInt();
	        	   System.out.println("enter the weight in grams");
	        	   wgt=sc.nextInt();
	        	   choc= new Perk();
	        	   total_weight=choc.calcweight(num, wgt);
	        	   totalbox_wt=totalbox_wt+total_weight;
	        	   System.out.println("total weight is:"+total_weight+"grams");
	        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	               
	        	   System.out.println("do you want any other item (y/n)");
	        	   n1=sc.next().charAt(0);
	        	      if(n1=='y'|| n1=='Y')
	        	        { 
	        	    	  n=true;
	        	          break;
	        	        }
	        	     else
	        		    {
	        	    	 n=false;
	                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	                     System.out.println("Total number of candies in the giftbox is:"+total_candies);
	                     break;
	                    }
	        case '2':
	        	   System.out.println("enter the number");
	        	   num=sc.nextInt();
	        	   System.out.println("enter the weight in grams");
	        	   wgt=sc.nextInt();
	        	   choc=new Snickers();
	        	   total_weight=choc.calcweight(num, wgt);
	        	   totalbox_wt=totalbox_wt+total_weight;

	        	   System.out.println("total weight is:"+total_weight+"grams");
	        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	   System.out.println("do you want any other item (y/n)");
	        	   n1=sc.next().charAt(0);
	        	      if(n1=='y'|| n1=='Y')
	        	        { 
	        	    	  n=true;
	        	          break; 
	        	        }
	        	      else
	        		    {
	        	    	  n=false;
	        	          System.out.println("Toatal gift box weight is:"+totalbox_wt+"grams");
	        	          System.out.println("Total number of candies in the giftbox is:"+total_candies);
	        	          break;
	        	        }
	        case '3':
	        	System.out.println("enter the number");
	        	num=sc.nextInt();
	        	System.out.println("enter the weight in grams");
	        	wgt=sc.nextInt();
	        	choc=new Kitkat();
	        	total_weight=choc.calcweight(num, wgt);
	        	totalbox_wt=totalbox_wt+total_weight;

	        	System.out.println("total weight is:"+total_weight+"grams");
	        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	System.out.println("do you want any other item (y/n)");
	        	n1=sc.next().charAt(0);
	        	if(n1=='y'|| n1=='Y')
	        	    {n=true;
	        	break;}
	        	else
	        		{n=false;
	        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
	        	break;}
	        case '4':
	        	System.out.println("enter the number");
	        	num=sc.nextInt();
	        	System.out.println("enter the weight in grams");
	        	wgt=sc.nextInt();
	        	choc=new Munch();
	        	total_weight=choc.calcweight(num, wgt);
	        	totalbox_wt=totalbox_wt+total_weight;
	        	total_candies=total_candies+num;

	        	System.out.println("total weight of Candies is:"+total_weight+"grams");
	        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	System.out.println("do you want any other item (y/n)");
	        	n1=sc.next().charAt(0);
	        	if(n1=='y'|| n1=='Y')
	        	    {n=true;
	        	break;}
	        	else
	        		{n=false;
	        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	                System.out.println("Total number of candies in the giftbox is:"+total_candies);
	                
	        	break;}
	        case '5':
	        	System.out.println("please enter the quantity");
	        	num=sc.nextInt();
	        	System.out.println("please enter the weight in grams");
	        	wgt=sc.nextInt();
	        	choc=new Dairymilk();
	        	total_weight=choc.calcweight(num, wgt);
	        	totalbox_wt=totalbox_wt+total_weight;

	        	System.out.println("total weight is:"+total_weight+"grams");
	        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	System.out.println("do you want any other item (y/n)");
	        	n1=sc.next().charAt(0);
	        	if(n1=='y'|| n1=='Y')
	        	    {n=true;
	        	break;}
	        	else
	        		{n=false;
	        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
	        	break;}
	       
	        
	 
	        }}
	        catch(Exception e)
	        {
	        	System.out.println("select from 1-5 numbers");
	            
	        
	        
	    }}
	        sc.close();
	}

}
