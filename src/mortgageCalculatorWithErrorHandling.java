import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculatorWithErrorHandling {

	public static void main(String[] args) {
		System.out.println("Welcome to the Beautiful Mortgage Calculator.");
		
		System.out.println("");
		//get principle
		System.out.print("What is your principle? Please enter a number between 1000 and 1000000: ");
		Scanner scanner = new Scanner(System.in);
		String userPrinciple = scanner.next();
		double realPrinciple = Double.parseDouble(userPrinciple);
		
		
		while (realPrinciple < 1000 || realPrinciple > 1000000) {	
			System.out.print("What is your principle? Please enter a number between 1000 and 1000000: ");
			userPrinciple = scanner.next();
			 realPrinciple = Double.parseDouble(userPrinciple);
			continue;
		}

		
		//get monthly interest rate
		System.out.print("What is your annual interest rate? ");
		String userInterest = scanner.next();
		double realAnnual = Double.parseDouble(userInterest);
		double monthlyInterest = (realAnnual / 100) / 12;
		
		while (realAnnual < 1 || realAnnual > 30) {
			System.out.print("What is your annual interest rate? Please enter a number between 1 and 30: ");
			 userInterest = scanner.next();
			 realAnnual = Double.parseDouble(userInterest);
			 monthlyInterest = (realAnnual / 100) / 12;

			continue;
		}
		
	
		
		//get period in years
		System.out.print("What is the period in years? Please enter a number between 1 and 30: ");
		String userPeriod = scanner.next();
		double realPeriod = Double.parseDouble(userPeriod);
		double periodInMonths = realPeriod * 12;
		
		while (realPeriod < 1 || realPeriod > 30) {
			System.out.print("What is the period in years? Please enter a number between 1 and 30: ");
			 userPeriod = scanner.next();
			 realPeriod = Double.parseDouble(userPeriod);
			 periodInMonths = realPeriod * 12;
			 
			 continue;
		}
		
		double mortgage = realPrinciple * (monthlyInterest * (Math.pow((1+monthlyInterest),periodInMonths ) / ((Math.pow((1 + monthlyInterest), periodInMonths)) -1)));
		System.out.println("");
		NumberFormat convert = NumberFormat.getCurrencyInstance();
		String mortgageRate = convert.format(mortgage);
		System.out.println("Your mortgage rate is" + " " + mortgageRate);
		
	
	}




	}

}
