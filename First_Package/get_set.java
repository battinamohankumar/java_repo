package First_Package;

public class get_set {
	public class MyClass {
	    private int myPrivateField;

	    // Getter for myPrivateField
	    public int getMyPrivateField() {
	        return myPrivateField;
	    }

	    // Setter for myPrivateField
	    public void setMyPrivateField(int value) {
	        myPrivateField = value;
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        MyClass myObject = new MyClass();

	        // Using the setter to set the value of myPrivateField
	        myObject.setMyPrivateField(42);

	        // Using the getter to retrieve the value of myPrivateField
	        int retrievedValue = myObject.getMyPrivateField();
	        System.out.println("Retrieved value: " + retrievedValue);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	class Student{  
		int rollno;  
		String name;  
		float fee;  
		Student(int rollno,String name,float fee){  
		rollno=rollno;  
		name=name;  
		fee=fee;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		}  
		class TestThis1{  
		public static void main(String args[]){  
		Student s1=new Student(111,"ankit",5000f);  
		Student s2=new Student(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		}}  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Let us see another example of default constructor  
		//which displays the default values  
		class Student3{  
		int id;  
		String name;  
		//method to display the value of id and name  
		void display(){System.out.println(id+" "+name);}  
		  
		public static void main(String args[]){  
		//creating objects  
		Student3 s1=new Student3();  
		Student3 s2=new Student3();  
		//displaying values of the object  
		s1.display();  
		s2.display();  
		}  
		}  
		
		
		
		
		
		
		
		public class MyClass {
		    // Default constructor
		    public MyClass() {
		        // Initialization code (if needed)
		    }
		}
		public class MyClass {
		    // Parameterized constructor
		    public MyClass(int initialValue) {
		        // Initialization code using the provided parameter
		    }
		}

		MyClass obj = new MyClass(42); // Creating an object and initializing it with the value 42

		
		
		public class MyClass {
		    private int x;

		    public void setX(int x) {
		        // Use 'this' to refer to the instance variable x
		        this.x = x;
		    }

		    public void printX() {
		        // Use 'this' to invoke the current object's method
		        System.out.println("Value of x: " + this.getX());
		    }

		    public int getX() {
		        return this.x;
		    }
		}
		
		
		
		
		
		class Animal {
		    void eat() {
		        System.out.println("Animal is eating");
		    }
		}

		class Dog extends Animal {
		    void eat() {
		        // Use 'super' to call the eat method of the parent class
		        super.eat();
		        System.out.println("Dog is eating");
		    }
		}

		public class TestSuper {
		    public static void main(String[] args) {
		        Dog dog = new Dog();
		        dog.eat();
		    }
		}
		
		
		
		
		package com.example.myapp;

		public class MyClass {
		    private int myVariable;

		    public void setMyVariable(int value) {
		        myVariable = value;
		    }

		    public int getMyVariable() {
		        return myVariable;
		    }
		}

		
		public class MyClass {
		    public void displayMessage(String message) {
		        System.out.println("Message: " + message);
		    }

		    public static void main(String[] args) {
		        // Creating and using an anonymous object
		        new MyClass().displayMessage("Hello, Anonymous Object!");

		        // Another example with a different method
		        int result = new Calculator().add(5, 3);
		        System.out.println("Result: " + result);
		    }
		}

		class Calculator {
		    public int add(int a, int b) {
		        return a + b;
		    }
		}

		
		class Animal {
		    void eat() {
		        System.out.println("This animal eats food.");
		    }
		}

		class Dog extends Animal {
		    void bark() {
		        System.out.println("The dog barks.");
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        Dog myDog = new Dog();
		        myDog.eat();  // Inherited from Animal class
		        myDog.bark(); // Specific to Dog class
		    }
		}

		
		
		class Subclass extends Superclass {
		    // subclass members
		}

**************************************************************************************************	
		class Superclass {
		    void myMethod() {
		        // superclass implementation
		    }
		}

		class Subclass extends Superclass {
		    @Override
		    void myMethod() {
		        // subclass implementation
		    }
		}
***********************************************************************************************
		class Subclass extends Superclass {
		    void myMethod() {
		        super.myMethod(); // invoking superclass method
		        // subclass implementation
		    }
		}

//Single Inheritance

class Parent {
    // Parent class members
}

class Child extends Parent {
    // Child class members
}
********************************************************
//Multilevel Inheritance
class Grandparent {
    // Grandparent class members
}

class Parent extends Grandparent {
    // Parent class members
}

class Child extends Parent {
    // Child class members
}
****************************************************************
interface Interface1 {
    // Interface1 members
}

interface Interface2 {
    // Interface2 members
}

class MyClass implements Interface1, Interface2 {
    // MyClass members
}


//First interface
interface Interface1 {
 void method1();
}

//Second interface
interface Interface2 {
 void method2();
}

//Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
 @Override
 public void method1() {
     // Implementation of method1
 }

 @Override
 public void method2() {
     // Implementation of method2
 }

 // Additional members of MyClass
}

class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Cat extends Animal {
    // This method overrides the makeSound method in the superclass
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    // This method overrides the makeSound method in the superclass
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound(); // Output: Meow
        animal2.makeSound(); // Output: Woof
    }
}




//save by A.java  
package pack;  
public class A{  
public void msg(){System.out.println("Hello");}  
}  
************************************************************************
//save by B.java  
package mypack;  
import pack.*;  

class B{  
public static void main(String args[]){  
 A obj = new A();  
 obj.msg();  
}  
}  























































































































		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}



















