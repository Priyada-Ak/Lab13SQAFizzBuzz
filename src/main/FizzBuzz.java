package main;

public class FizzBuzz {
	public static String checkerNumber(int num) {
	    if(num > 0 && num < 101) {
            if (num % 3 == 0 && num % 5 == 0) {
                return "FizzBuzz"; 
             }else if (num % 5 == 0) {
                return "Buzz"; 
             }else if (num % 3 == 0) {
                return "Fizz"; 
             }else {
                return Integer.toString(num); 
             }
       }else {
           return "The number must be between 0-100!";
       }
		
    }
}
