package day4;

public class IsPrimeNo {
	static boolean isprime(int n) {
		if(n%2==0)
			return false;
		for(int i=3;i<Math.sqrt(n);i++) 
			if(n%i==0)
				return false;
		return true;
	}
	
	static boolean isPrimeOpt(int n) {
	    {
	        // Corner case
	        if (n <= 1)
	            return false;
	         // For n=2 or n=3 it will check
	        if (n == 2 || n == 3)
	            return true;
	        // For multiple of 2 or 3 This will check 
	        if (n % 2 == 0 || n % 3 == 0)
	            return false;
	        // It will check all the others condition
	        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
	            if (n % i == 0 || n % (i + 2) == 0)
	                return false;

	        return true;
	    }
	}

	public static void main(String[] args) {
		System.out.println(isprime(15));
	}
}
