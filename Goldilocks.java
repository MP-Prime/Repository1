package com.qa.day4;

public class Goldilocks {
	public void chairandporridge(int gchair, int gporridge) {
		int[] chair = {297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
		int[] porridge = {90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
		
		
		for (int i = 0; i < chair.length; i++){
			
			if(chair[i] >= gchair) {

				
				for (int j = 0; j < porridge.length; j++){
					if(porridge[j] >= gporridge) {
						if(i == j) {
							System.out.println(i+1);
						}
					}
				}
				
			}
		}
		
		
		
	}


}
