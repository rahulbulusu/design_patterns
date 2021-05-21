/**
 * Is a specific car type called small car which has the methods for adding frame and 
 * particular accessories that goes with the small car. In addition it holds two 
 * parameters as well.
 * @author Rahul Bulusu
 */
public class SmallCar extends Car{
	
	/**
	 * Gets the make and model for a small car from the car class using super
	 * @param make gets the make of the small car 
	 * @param model gets the model of the small car 
	 */
	public SmallCar(String make, String model) {
		super(make, model);
	}
	
	/**
	 * Displays "adding a small frame" for a small car
	 */
	protected void addFrame() {
		System.out.println("Adding a small frame");
	}
	
	/**
	 * Adds two accessories to the small car: floor matts and phone charger
	 */
	protected void addAccessories() {
		accessories.add(Accessories.FLOOR_MATTS);
		accessories.add(Accessories.PHONE_CHARGER);
	}
}
