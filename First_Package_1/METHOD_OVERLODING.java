package First_Package;

public class METHOD_OVERLODING {
	
	public class Calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	    Calculator calculator = new Calculator();

	    int result1 = calculator.add(3, 5);                  // Calls the first method (int version)
	    double result2 = calculator.add(3.5, 2.5);           // Calls the second method (double version)
	    int result3 = calculator.add(1, 2, 3);               // Calls the third method (int version)

	}

	

}
