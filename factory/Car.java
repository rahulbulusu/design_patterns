import java.util.ArrayList;

/**
 * Holds variables to keep track of the cars by make, model, and accessories.
 * In addition, it also includes specific methods for the cars such as 
 * assembling, frame, wheels, engine, windows, adding accessories, and displaying accessories.
 * @author Rahul Bulusu
 */
public abstract class Car {
	private String make;
	private String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();
	
	/**
	 * Holds the variables for the car's make and model and
	 * displays the make and the model of the cars.
	 * @param make what make each car is
	 * @param model what model each car is
	 */
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
		System.out.println("Creating a "+make+" "+model);
	}
	
	/**
	 * calls the different methods seen below.
	 */
	public void assemble() {
		addFrame();
		addWheels();
		addEngine();
		addWindows();
		addAccessories();
		displayAccessories();
		
	}
	/**
	 * is an abstract class for the particular frame for each car.
	 */
	protected abstract void addFrame();
		
	/**
	 * displays "adding the wheels" for each car.
	 */
	protected void addWheels() {
		System.out.println("Adding the Wheels");
	}
	
	/**
	 * displays "adding a standard engine" for each car.
	 */
	protected void addEngine() {
		System.out.println("Adding a Standard Engine");
	}
	
	/**
	 * displays "adding windows" for each car.
	 */
	protected void addWindows() {
		System.out.println("Adding Windows");
	}
	
	/**
	 * adds the accessories for each car (abstract method).
	 */
	protected abstract void addAccessories();
	
	/**
	 * displays the accessories for each car in a particular way as shown in the output.
	 */
	protected void displayAccessories() {
		System.out.println("Accessories:");
		for(int i=0; i<accessories.size(); i++) {
			System.out.println("- "+accessories.get(i));
		}
	}
}
