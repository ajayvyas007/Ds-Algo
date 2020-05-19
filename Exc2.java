package blog_site;

public class Exc2 {
	
	/**
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	 * @param args
	 */
	public static void main(String[] args) {
		long num1 = 0, num2 = 1, temp = 0, sum = 0;
		
		do {
			if(num2 % 2 == 0) {
				sum+=num2;
			}
			
			temp = num1+num2;
			num1 = num2;
			num2 = temp;
			
		} while(num2 < 4000000);
		
		System.out.print(sum);
	}

}
