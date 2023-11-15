package First_Package;
	public class Theoretical {
		    // Fields (attributes) of the class
		    private String topic;
		    private int year;

		    // Constructor
		 public Theoretical(String topic, int year) {
		        this.topic = topic;
		        this.year = year;
		    }

		    // Methods (behaviors) of the class
		  public void displayInformation() {
		        System.out.println("Topic: " + topic);
		        System.out.println("Year: " + year);
		    }

		    // Getter and setter methods for the fields
		  public String getTopic() {
		        return topic;
		    }

		  public void setTopic(String topic) {
		        this.topic = topic;
		    }

		    public int getYear() {
		        return year;
		    }

		    public void setYear(int year) {
		        this.year = year;
		    }

		    public static void main(String[] args) {
		        // Create an instance of the Theoretical class
		        Theoretical myTheory = new Theoretical("Quantum Mechanics", 1925);

		        // Call a method to display information about the theoretical concept
		        myTheory.displayInformation();

		        // Modify the topic and year using setter methods
		        myTheory.setTopic("General Relativity");
		        myTheory.setYear(1915);

		        // Display updated information
		        myTheory.displayInformation();
		    }
		}


	


