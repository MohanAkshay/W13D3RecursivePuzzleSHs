package recursionPuzzles;

public class Letter {

                static String result ="";          
                private static String letters(char finalCharacter) {               

          // Replace the following function with the recursive function to be tested

       result= finalCharacter + result;
       if (finalCharacter == 'a') return result;
       return letters(--finalCharacter);
       }

                public static void main(String [] args) {

       // Local variables used for testing

   String actualResult;

   String expectedResult;

                               
       // Test Number 1

   actualResult = letters('g');             // Test the Base Case
   expectedResult = "abcdefg";              // Replace this line with what the actual expected result should be
   if (actualResult == expectedResult)
   System.out.println("Test 1: Pass; Result: " + actualResult);
  else
   System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

 
       // Test Number 2

   actualResult = letters('a');             // Test one away from the Base Case
   expectedResult = "a";                    // Replace this line with what the actual expected result should be
   if (actualResult == expectedResult)
   System.out.println("Test 2: Pass; Result: " + actualResult);
  else
   System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

 
       // Test Number 3
   actualResult = letters('e');            // Test a number of iterations away from the Base Case
   expectedResult = "abcde";               // Replace this line with what the actual expected result should be
   if (actualResult == expectedResult)
   System.out.println("Test 3: Pass; Result: " + actualResult);

 else
   System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

                }

}