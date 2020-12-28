import java.text.NumberFormat;
import java.util.*;

public class mortgage {

	public static void main(String[] args) {
	

		System.out.println("Welcome to the Beautiful Mortgage Calculator.");
		
		System.out.println("");
		//get principle
		System.out.print("What is your principle? ");
		Scanner scanner = new Scanner(System.in);
		String userPrinciple = scanner.next();
		double realPrinciple = Double.parseDouble(userPrinciple);
		
		//get monthly interest rate
		System.out.print("What is your annual interest rate? ");
		String userInterest = scanner.next();
		double realAnnual = Double.parseDouble(userInterest);
		double monthlyInterest = (realAnnual / 100) / 12;
		
		//get period in years
		System.out.print("What is the period in years? ");
		String userPeriod = scanner.next();
		double realPeriod = Double.parseDouble(userPeriod);
		double periodInMonths = realPeriod * 12;
		
		double mortgage = realPrinciple * (monthlyInterest * (Math.pow((1+monthlyInterest),periodInMonths ) / ((Math.pow((1 + monthlyInterest), periodInMonths)) -1)));
		System.out.println("");
		NumberFormat convert = NumberFormat.getCurrencyInstance();
		String mortgageRate = convert.format(mortgage);
		System.out.println("Your mortgage rate is" + " " + mortgageRate);
		
	
	}

}
