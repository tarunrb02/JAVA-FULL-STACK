package arthmetic;

public class IsPrime {

	    
	    // Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        // Corner cases: numbers less than or equal to 1 are not prime
	        if (n <= 1) {
	            return false;
	        }
	        // 2 is the only even prime number
	        if (n == 2) {
	            return true;
	        }
	        // Exclude all other even numbers
	        if (n % 2 == 0) {
	            return false;
	        }
	        
	        // Check odd factors up to the square root of n
	        for (int i = 3; i <= Math.sqrt(n); i += 2) {
	            if (n % i == 0) {
	                return false; // Found a factor, so it is not prime
	            }
	        }
	        
	        return true; // No factors found, it is prime
	    }

	    public static void main(String[] args) {
	        int number = 10;
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

}
