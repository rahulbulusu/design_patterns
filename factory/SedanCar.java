/**
 * Is a specific car type called Sedan Car which has the methods for adding frame and 
 * particular accessories that goes with the Sedan Car. In addition it holds two 
 * parameters as well.
 * @author Rahul Bulusu
 */
public class SedanCar extends Car{
	
	/**
	 * Gets the make and model for a Sedan Car from the car class using super
	 * @param make gets the make of the Sedan Car 
	 * @param model gets the model of the Sedan Car 
	 */
	public SedanCar(String make, String model) {
		super(make, model);
	}
	
	/**
	 * Displays "adding a three part frame" for the Sedan Car
	 */
	protected void addFrame() {
		System.out.println("Adding a three part frame");
	}
	
	/**
	 * Adds the following accessories for a Sedan Car.
	 */
	protected void addAccessories() {
		accessories.add(Accessories.FLOOR_MATTS);
		accessories.add(Accessories.PHONE_CHARGER);
		accessories.add(Accessories.BACK_UP_CAMERA);
		accessories.add(Accessories.EXTRA_CUP_HOLDERS);
		accessories.add(Accessories.HEATED_SEATS);
	}
}
