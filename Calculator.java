package com.qa.day4;

public class Calculator {
	public void calcsum(int number1, int number2, int number3) {
		int sum1 = number1 + number2;
		int sum2 = number2 + number3;
		int sum3 = number1 + number3;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
	
	public void calcsub(int number1, int number2, int number3) {
		int sub1 = number1 - number2;
		int sub2 = number2 - number3;
		int sub3 = number1 - number3;
		int sub4 = number3 - number2;
		int sub5 = number2 - number1;
		int sub6 = number3 - number1;
		if(sub1 >= 0) {System.out.println(sub1);}
		if(sub2 >= 0) {System.out.println(sub2);}
		if(sub3 >= 0) {System.out.println(sub3);}
		if(sub4 >= 0) {System.out.println(sub4);}
		if(sub5 >= 0) {System.out.println(sub5);}
		if(sub6 >= 0) {System.out.println(sub6);}
	}
	
	public void calcmul(int number1, int number2, int number3) {
		int sum1 = number1 * number2;
		int sum2 = number2 * number3;
		int sum3 = number1 * number3;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
	
	public void calcdiv(int number1, int number2, int number3) {
		int div1 = number1 / number2;
		int div2 = number2 / number3;
		int div3 = number1 / number3;
		int div4 = number3 / number2;
		int div5 = number2 / number1;
		int div6 = number3 / number1;
		int divmod1 = number1 % number2;
		int divmod2 = number2 % number3;
		int divmod3 = number1 % number3;
		int divmod4 = number1 % number2;
		int divmod5 = number2 % number3;
		int divmod6 = number1 % number3;
		if(div1 > 1) {
			if(divmod1 == 0) {
				System.out.println(divmod1);
			}
		}
		if(div2 > 1) {
			if(divmod2 == 0) {
				System.out.println(divmod2);
			}
		}
		if(div3 > 1) {
			if(divmod3 == 0) {
				System.out.println(divmod3);
			}
		}
		if(div4 > 1) {
			if(divmod4 == 0) {
				System.out.println(divmod4);
			}
		}
		if(div5 > 1) {
			if(divmod5 == 0) {
				System.out.println(divmod5);
			}
		}
		if(div6 > 1) {
			if(divmod6 == 0) {
				System.out.println(divmod6);
			}
		}
		
	}
	
	

}
