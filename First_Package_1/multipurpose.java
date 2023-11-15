package First_Package;

class Animal{
	
public void animalsound() {
	System.out.println("one");
  }
}

class dog extends Animal{
	
public void animalsound() {
	System.out.println("two");
  }
}

class cow extends Animal{
	
public void animalsound() {
	System.out.println("three");
  }
}

                              //main
public class multipurpose {

	public static void main(String[] args) {
	Animal myanimal = new Animal();
	dog mydog = new dog();
	cow mycow = new cow();
	
	myanimal.animalsound();
	mydog.animalsound();
	mycow.animalsound();
	}

}
