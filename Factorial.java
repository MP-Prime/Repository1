package com.qa.day4;

public class Factorial {
	int j = 1;
	
	
	boolean factor = false;
	boolean one = false;
	public void run(int input) {
		
        long fact = 1;
        int i = 1;
        
        while(fact == input)
        {
            fact = fact * i;
            i++;
            int two = i;
            if(input/fact == 1) {
            	System.out.println(two);
            }
        }
        
        System.out.println(fact);
        
        
        
		
		
	}

}
