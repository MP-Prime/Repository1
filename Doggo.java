package com.qa.day4;

public class Doggo {
	public void rundog() {
		
		  for(int i= 2; i < 3; i++) {
		  
			  System.out.println(i+"nd"); 

		  }
		  for(int i= 3; i < 4; i++) {
			  
			  System.out.println(i+"rd"); 

		  }
		  
			for (int i = 4; i < 21; i++) {
			
				System.out.println(i + "th");
			
			}
			for (int i = 21; i < 101; i++) {
			
				String str = i + "th";
				if (str.endsWith("1th")) {
				
					str = i + "st";
					
				} else if (str.endsWith("2th")) {
					str = i + "nd";
				} else if (str.endsWith("3th")) {
					str = i + "rd";
				}

				System.out.println(str);

			}
		 
	}

}
