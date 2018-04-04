package recursionPuzzles;

public class PowerOfThree {
	
	private static int recursiveFunctionToBeTested (int n) {
		// Replace the following function with the recursive function to be tested
		if (n <= 0) return 1;
		return recursiveFunctionToBeTested(n-1)*10;
	}

	public static void main(String [] args) {
		// Local variables used for testing
		int actualResult;
		int expectedResult;
		
		// Test Number 1
		actualResult = recursiveFunctionToBeTested(0);	// Test the Base Case
		expectedResult = 1;					// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 1: Pass; Result: " + actualResult);
		else
			System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

		// Test Number 2
		actualResult = recursiveFunctionToBeTested(1);	// Test one away from the Base Case
		expectedResult = 10;				// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 2: Pass; Result: " + actualResult);
		else
			System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

		// Test Number 3
		actualResult = recursiveFunctionToBeTested(5);	// Test a number of iterations away from the Base Case
		expectedResult = 100000;			// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 3: Pass; Result: " + actualResult);
		else
			System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
	}


}
