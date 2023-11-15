package First_Package;

public class STRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String(); // Creates an empty string

		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + " " + lastName; // Using '+'
		String greeting = "Hello".concat(", ").concat("World"); // Using 'concat()'

		String text = "Java is awesome!";
		int length = text.length(); // Returns 15

		String str1 = "Hello";
		String str2 = "hello";
		boolean isEqual = str1.equals(str2); // Returns false
		boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Returns true

		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = s2.intern(); // Adds s2 to the string pool


	}
public static void name() {
	
	//string buffer
	StringBuffer stringBuffer = new StringBuffer("Hello");
	stringBuffer.append(" World");
	stringBuffer.insert(5, "Java");
	stringBuffer.delete(6, 11);
	
   //string builder
	StringBuilder stringBuilder = new StringBuilder("Hello");
	stringBuilder.append(" World");
	stringBuilder.insert(5, "Java");
	stringBuilder.delete(6, 11);
 }
public static void name1() {
	
	// Example of a mutable object (StringBuilder)
	StringBuilder mutableStr = new StringBuilder("Hello");
	mutableStr.append(" World"); // Modifying the state
	System.out.println(mutableStr); // Output: Hello World

	// Example of an immutable object (String)
	String immutableStr = "Hello";
	immutableStr = immutableStr.concat(" World"); // Creating a new object with the modified state
	System.out.println(immutableStr); // Output: Hello World

}
public static void name3() {
	class MyClass {
	    // Static variable
	    static int staticVariable = 10;

	    public static void main(String[] args) {
	        // Accessing static variable
	        System.out.println(MyClass.staticVariable);   
	    }
	}	
}





























public class MyClass {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        // Calling static method
        MyClass.staticMethod();

        // Accessing static variable
        System.out.println(MyClass.staticVariable);
    }
}

}

public class MyClass {
    // Static variable
    static int staticVariable;

    // Static block
    static {
        // Initialize staticVariable
        staticVariable = 20;
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println(MyClass.staticVariable);

   }

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		MyClass.staticVariable = staticVariable;
	}
    
    
}


























    


























































