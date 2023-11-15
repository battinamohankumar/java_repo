package First_Package;

public class switch_st {
	
public static void main(String args[]) {
	
	int i = 2;
	String day ="";	
	day = switch(i) 
    {
	case 1->"monday";
	case 2->"tuesday";
	case 3->"wednesday";
	case 4->"thursday";
	case 5->"friday";
	case 6->"saturday";
	default->"invalid";
	};
	System.out.println(day);
	
  }

}
