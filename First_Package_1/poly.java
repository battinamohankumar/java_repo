package First_Package;

public class poly {
	private int name;
	
public poly(int name) {
	this.name=name;
	
	
}
	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	

	public static void main(String[] args) {
		
		poly obj = new poly(23);  //obj
		
        int car = obj.getName();   //get
        
        obj.setName(25);           //set   
        
        System.out.println( obj.getName());
	}


}
