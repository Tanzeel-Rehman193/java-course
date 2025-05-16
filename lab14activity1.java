public class lab14activity1 {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }

    // JUnit Test Cases
    public static class FactorialCalculatorTest {
        @Test
        public void testFactorialPositive() {
            assertEquals(120, factorial(5));
            assertEquals(1, factorial(0));
            assertEquals(24, factorial(4));
                    }
            
                    private void assertEquals(int i, int factorial) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
                    }
            
                    @Test
        public void testFactorialNegative() {
            assertThrows(IllegalArgumentException.class, () -> factorial(-1));
        }
    }
}