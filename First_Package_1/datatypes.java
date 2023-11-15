package First_Package;

public class datatypes {
    //	primitive Data Types
	byte myBite = 10;
	short myShort = 200;
	int myInt = 1000;
	long myLong = 100000L;
	float myFloat = 3.14f;
	double myDouble = 3.14159;
	char myChar = 'A';
	boolean myBoolean = true;
	

	public static void main(String[] args) {
		
		// non primitive Data Types
		String myString = "Hello, Java!";
		int[] myArray = {1, 2, 3, 4};
		datatypes x = new datatypes();    // Assuming datatypes is a user-defined class.
		
        System.out.println(x.myBoolean);
	}
	
}
